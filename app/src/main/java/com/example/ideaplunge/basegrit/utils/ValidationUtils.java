package com.example.ideaplunge.basegrit.utils;


import android.content.Context;
import android.util.Patterns;
import android.widget.Toast;

import java.util.regex.Pattern;


public class ValidationUtils {


  private Context mContext;


  public ValidationUtils(Context mContext) {
    this.mContext = mContext;
  }

  // Empty or Null Check
  public static boolean isNullOrEmpty(String input) {
    return input == null || input.isEmpty();

  }

  // Toast Display

  public static void displayToast(Context context, String msg) {
    Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
  }

  // UserNameValidation

  public static boolean isValidUsername(Context context, String username) {

    return isValidUsername(context, username, "^[a-zA-Z0-9._-]{3,20}$");
  }


  public static boolean isValidUsername(Context context, String username, String regex) {

    if (isNullOrEmpty(username)) {
      displayToast(context, "Please enter User name first.");
    } else if (!Pattern.matches(regex, username)) {
      displayToast(context, "Please enter a valid User name.");
    } else {
      return true;
    }
    return false;
  }


  // Email Validation
  public static boolean isValidEmail(Context context, String email) {

    if (isNullOrEmpty(email)) {
      displayToast(context, "Please enter Email first.");
    } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
      displayToast(context, "Please enter a valid Email address.");
    } else {
      return true;
    }
    return false;

  }
    //  Mobile Number Validation
    public static boolean isValidMobile (Context context, String mobile){
      return isValidMobile(context, mobile, "^[0-9]{10}$");
    }

    public static boolean isValidMobile (Context context, String mobile, String regex){
      if (isNullOrEmpty(mobile)) {
        displayToast(context, "Please enter Mobile number first.");
      } else if (!Pattern.matches(regex, mobile)) {
        displayToast(context, "Please enter a valid Mobile number.");
      } else {
        return true;
      }
      return false;
    }

    // Password Validation

  public static boolean isValidPassword(Context context, String password) {

    if (isNullOrEmpty(password)) {

      displayToast(context, "Please enter Password first.");
    } else if (password.length() < AppConstant.PASSWORD_MIN_LENGTH) {
      displayToast(context, "Password length should not be less than 6 characters");
    } else if (password.length() > AppConstant.PASSWORD_MAX_LENGTH) {
      displayToast(context, "Password length should not be greater than 30 characters");
    } else {
      return true;
    }
    return false;
  }


}


