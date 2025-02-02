package com.jpkhawam.nabu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceManager;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.navigation.NavigationView;

public class SettingsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        // Get Theme Color SharedPreferences
        String themeColor = settings.getString("settings_theme", getString(R.string.theme_default));
        // Get Font Type SharedPreferences
        String fontType = settings.getString("settings_fonttype", getString(R.string.font_type_default));
        // Get Font Size SharedPreferences
        String fontSize = settings.getString("settings_fontsize", getString(R.string.font_size_small));

        if (themeColor.equals("Nabu Light")) {
            getTheme().applyStyle(R.style.NabuLight, true);
        }
        if (themeColor.equals("Nabu Dark")) {
            getTheme().applyStyle(R.style.NabuDark, true);
        }

        // Set Settings Font Size Value According To Font Size SharedPreferences
        if (fontSize.equals(getString(R.string.font_size_medium))) {
            getTheme().applyStyle(R.style.settingsMediumTheme, false);
        }
        if (fontSize.equals(getString(R.string.font_size_large))) {
            getTheme().applyStyle(R.style.settingsLargeTheme, false);
        }
        // Add Dyslexia-Friendly fontFamily Style To The Default Theme According To Font Type SharedPreferences
        if (fontType.equals(getString(R.string.font_type_dyslexia))) {
            getTheme().applyStyle(R.style.DyslexiaTheme, false);
        }
        setContentView(R.layout.activity_settings);

        DrawerLayout drawerLayout = findViewById(R.id.mainLayout);
        Toolbar toolbar = findViewById(R.id.main_toolbar_settings);

        setSupportActionBar(toolbar);

        // Instantiate Settings Fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.SettingsConstraintLayout, new SettingsFragment()).commit();

        NavigationView navigationView = findViewById(R.id.nav_view);
        // Set NavigationView Font Size According To Font Size SharedPreferences}
        if (fontSize.equals("Small")) {
            navigationView.setItemTextAppearance(R.style.NavigationViewSmall);
        }
        if (fontSize.equals("Medium")) {
            navigationView.setItemTextAppearance(R.style.NavigationViewMedium);
        }
        if (fontSize.equals("Large")) {
            navigationView.setItemTextAppearance(R.style.NavigationViewLarge);
        }
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav_drawer, R.string.close_nav_drawer);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.notes:
                try {
                    Intent mainIntent = new Intent(this, MainActivity.class);
                    startActivity(mainIntent);
                } catch (Exception e) {
                    e.printStackTrace();

                    new MaterialAlertDialogBuilder(this)
                            .setMessage(e.toString())
                            .setPositiveButton("Ok", null)
                            .show();
                }
                return true;
            case R.id.archive:
                try {
                    Intent archiveIntent = new Intent(this, ArchiveActivity.class);
                    startActivity(archiveIntent);
                } catch (Exception e) {
                    e.printStackTrace();

                    new MaterialAlertDialogBuilder(this)
                            .setMessage(e.toString())
                            .setPositiveButton("Ok", null)
                            .show();
                }
                return true;
            case R.id.trash:
                try {
                    Intent trashIntent = new Intent(this, TrashActivity.class);
                    startActivity(trashIntent);
                } catch (Exception e) {
                    e.printStackTrace();

                    new MaterialAlertDialogBuilder(this)
                            .setMessage(e.toString())
                            .setPositiveButton("Ok", null)
                            .show();
                }
                return true;
            default:
                return false;
        }
    }
}
