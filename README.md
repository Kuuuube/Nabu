# Nabu - An Offline Note Taking App
### Note: still in development! This is an early release currently.
---

Nabu is a simple note taking app, focused on looking as modern as possible, without a trade-off of features. 

This app has a great priority for accessibility before all, so if there is anything lacking on that front please submit an issue. So far, font size can be set to x1, x1.5 and x2, and the font family can be changed to a dyslexia friendly font (opendyslexic). I also made sure to label everything so screen readers have a better time, and will try to translate the app as much as I can.

Feel free to try it out and let me know what is missing or not working! Pull requests and issues are most welcome.

# What is not implemented yet?
Currently, pinning notes and adding reminders are not implemented. Everything else should be working.

# Screenshots

### First Launch
On first launch, user is prompted if they need accessibility settings right away
<p align="center">
<img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/1-accessibility_prompt_light.png" alt="screenshot of accessibility prompt that shows on first launch, asking the user if they need accessibility settings" height="550"/> <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/2-accessibility_prompt_dark.png" alt="same screenshot of accessibility prompt but in dark mode" height="550"/>
</p>

### Main Screen
This is what the main screen looks like in light/dark mode
<p align="center">
  <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/3-main_screen_light.png" alt="screenshot main page in light mode. it shows how notes are layed out in a grid" height="550"/> <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/4-main_screen_dark.png" alt="same screenshot of layout but in dark mode" height="550"/>
</p> 

### Main Screen with Accessibility Settings On
This is how it looks like with the dyslexia font / bigger font 
<p align="center">
  <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/5-main_screen_light_dyslexia.png" alt="screenshot of main page but with the font changed to a font easy to read by dyslexic people" height="550"/> <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/6-main_screen_dark_dyslexia_larger_font.png" alt="same screenshot but with a larger font" height="550"/>
</p> 

### Note Editing Screen
This is the screen shown when editing a note
<p align="center">
  <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/7-note_edit_light.png" alt="screenshot of the screen that shows up when you edit a note (in light mode)" height="550"/> <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/8-note_edit_dark.png" alt="same screenshot of note editing but with dark mode" height="550"/>
</p> 

### Note Editing Screen with Accessibility Settings
This is how it looks like with the font modified 
<p align="center">
  <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/9-note_edit_dark_dyslexia.png" alt="screenshot of the screen that shows up when you edit a note with dyslexia font turned on" height="550"/> <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/10-note_edit_light_larger_font.png" alt="same screenshot of note editing but with larger font" height="550"/>
</p> 

### Navigation View And Other Activities
<p align="center">
  <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/11-extra_1.png" alt="screenshot of the sidebar that lets you navigate between notes, archive, trash and settings" height="550"/> <img align="center" src="https://github.com/jpkhawam/Nabu/blob/main/fastlane/metadata/android/en-US/images/phoneScreenshots/12-extra_2.png" alt="screenshot of confirmation dialog when deleting notes permanently" height="550"/>
</p> 

## Building

Built on Android Studio 2021.3.1, installing through ADB is recommended for testing.

To install through ADB:

1. Enable ADB through developer options on your phone

2. Plug your phone into your computer or connect wirelessly

3. Run the app from Android Studio