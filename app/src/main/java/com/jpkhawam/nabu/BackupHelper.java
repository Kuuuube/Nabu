package com.jpkhawam.nabu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BackupHelper {

    public void exportFile(File src, File dst) throws IOException {
        //if folder does not exist
        if (!dst.exists()) {
            if (!dst.mkdir()) {
                return;
            }
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date timeStamp = new Date();
        if (backupDate(timeStamp)) {
            File expFile = new File(dst.getPath() + File.separator + "notes_" + dateFormat.format(timeStamp) + ".db");
            FileChannel inChannel = null;
            FileChannel outChannel = null;

            inChannel = new FileInputStream(src).getChannel();
            outChannel = new FileOutputStream(expFile).getChannel();

            try {
                inChannel.transferTo(0, inChannel.size(), outChannel);
            } finally {
                if (inChannel != null)
                    inChannel.close();
                if (outChannel != null)
                    outChannel.close();
            }
        }
    }

    private static Date timeStampPrev;

    private boolean backupDate(Date timestamp) {
        if (timeStampPrev == null) {
            timeStampPrev = timestamp;
            return true;
        }
        else
            {
            if (timestamp.getTime() - (timeStampPrev.getTime()) > 86400000) {
                timeStampPrev = timestamp;
                return true;
            } else {
                return false;
            }
        }
    }
}
