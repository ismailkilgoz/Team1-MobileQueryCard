<p align="center">
   <a href="https://appium.io/">
      <img alt="Appium" src="https://raw.githubusercontent.com/appium/appium/master/packages/appium/docs/overrides/assets/images/appium-logo-horiz.png" width="500">
   </a>
</p>
<p align="center">
   Cross-platform test automation for native, hybrid, mobile web and desktop apps.
</p>

<div align="center">

[![NPM version](https://badge.fury.io/js/appium.svg)](https://npmjs.org/package/appium)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bhttps%3A%2F%2Fgithub.com%2Fappium%2Fappium.svg?type=shield)](https://app.fossa.io/projects/git%2Bhttps%3A%2F%2Fgithub.com%2Fappium%2Fappium?ref=badge_shield)

</div>

***

<p align="center">
<b>
   <a href="https://appium.io/docs/en/latest/intro/">Get Started</a> |
   <a href="https://appium.io">Documentation</a>
</b></p>

***

Appium is an open-source automation framework that provides
[WebDriver](https://www.w3.org/TR/webdriver/)-based automation possibilities for a wide range of
different mobile, desktop and IoT platforms. Appium is modular and extensible, and supports multiple
programming languages, which means there is an entire ecosystem of related software:

As a test developer, it is quite difficult to create a good automated test suite that works on iOS and Android platforms. Both Android and iOS have several different testing frameworks that work well but have nothing to do with each other. Therefore, you need to create and maintain two separate test suites, one for Android and one for iOS. They are also written in different languages and with different development tools (IDEs), so it is difficult to share any code between tests for different platforms, even if the apps work the same way. But this is exactly where Appium comes in. From Appium's own website:

Appium is ‘cross-platform’: it allows you to write tests against multiple platforms (iOS, Android) using the same API. This enables code reuse between iOS and Android test suites.

## 🛠 Requirements
The following tools are required to run the project:
- **Java JDK 17 temurin**
- **Maven 3.6.0 or later**
- **Git / Github**
- **Appium Inspector**
- **Android Studio**
- **Appium that runs in cmd**
- An IDE (IntelliJ IDEA recommended)

***

### src > test > java:
* [__Apps__](#apps) apk files locates here
* [__Hooks__](#hooks) closing the program with these classes
* [__Pages__](#pages) WebElements locate in these page classes
* [__StepDefinitions__](#stepdefinitions) methods of feature steps are written in these classes
* [__Utilities__](#utilites) useful methods are here to use in order to execute steps as helper

### resources
* [__Feature__](#feature) Feauture of User Stories can be found this package 

***

* [__Naming the Feature File__](#feature) The name should be following: USXXX_(Summary with some words).feature
* Example: US001_HomePage.feature
* Classes are named with Camel Case format. Keep in mind that start with capital letter

***

## Running the tests

To run your tests simply you need to  execute the following command from in command window.

```
appium
```

