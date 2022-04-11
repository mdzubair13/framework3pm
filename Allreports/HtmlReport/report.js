$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:forgrt.feature");
formatter.feature({
  "name": "check Forgetten functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to click forgetten button Click",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser lunch",
  "keyword": "Given "
});
formatter.match({
  "location": "AllDetailClass.browser_lunch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login button",
  "keyword": "When "
});
formatter.match({
  "location": "AllDetailClass.login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Forgotten password\u0027]\"}\n  (Session info: chrome\u003d99.0.4844.84)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RIGKATV\u0027, ip: \u0027192.168.68.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.84, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\zubee\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56191}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ff0d180cd8e40a250bf674fae6aeec5b\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Forgotten password\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.baseclass.HelperClass.btnClick(HelperClass.java:54)\r\n\tat org.stepDefinition.AllDetailClass.login_button(AllDetailClass.java:27)\r\n\tat ✽.login button(file:forgrt.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AllDetailClass.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:loginf.feature");
formatter.feature({
  "name": "To check login funcionality of facebook account",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "to open facebook through chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "AllDetailClass.to_open_facebook_through_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login valid user name and pass",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user have enter valid user and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "siva"
      ]
    },
    {
      "cells": [
        "password",
        "hari"
      ]
    },
    {
      "cells": [
        "emailid",
        "sicaa@fgnsfg"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AllDetailClass.user_have_enter_valid_user_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid password msg",
  "keyword": "Then "
});
formatter.match({
  "location": "AllDetailClass.invalid_password_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "to open facebook through chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "AllDetailClass.to_open_facebook_through_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login valid user name and valid pass",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user have enter valid user and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "email"
      ]
    },
    {
      "cells": [
        "java",
        "python",
        "sql"
      ]
    },
    {
      "cells": [
        "selenium",
        "git",
        "demo"
      ]
    },
    {
      "cells": [
        "cuccumber",
        "testng",
        "junit"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AllDetailClass.user_have_enter_valid_user_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid password msg",
  "keyword": "Then "
});
formatter.match({
  "location": "AllDetailClass.invalid_password_msg()"
});
formatter.result({
  "status": "passed"
});
});