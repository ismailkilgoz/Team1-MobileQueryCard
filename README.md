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
# QueryCart Mobile Projesi

## Proje Hakkında (About the Project)
QueryCart Mobile Projesi, Selenium ve Cucumber teknolojileri kullanılarak geliştirilmiş bir test otomasyon projesidir. Bu proje, QueryCart uygulamasini test etmek için tasarlanmıştır. Proje, Maven yapısını takip eder ve Java programlama dilinde geliştirilmiştir.

## Kullanılan Teknolojiler (Technologies Used)
- **Java** (17+)
- **Maven**
- **Selenium** (v4.13.0)
- **Cucumber** (v7.4.1)
- **Appium** (v8.6.0)
- **Lombok** (v1.18.30)
- **Apache POI** (v5.2.3)
- **Log4j** (v2.20.0)
- **JUnit 5** (v5.10.0)
- **JavaFaker** (v1.0.2)

## Proje Yapısı (Project Structure)
```
ApponteOtomasyon/
├── src/test/java/
│   ├── Apps/                 # Uygulama ile ilgili sınıflar
│   ├── Pages/                # Sayfa nesnesi modeli (Page Object Model)
│   ├── Runner/               # Cucumber Runner sınıfları
│   ├── stepdefinitions/      # Test adımları (Step Definitions)
│   ├── utilities/            # Yardımcı sınıflar (Utilities)
│   │   ├── ConfigReader      # Konfigürasyon dosyalarını okuma
│   │   ├── Driver            # Sürücü yönetimi
│   │   ├── ExcelDataReader   # Excel verilerini okuma
│   │   ├── OptionsMet        # Appium seçenekleri
│   │   └── ReusableMethods   # Yeniden kullanılabilir yöntemler
├── resources/                # Proje kaynak dosyaları
│   ├── features/             # Feature dosyaları
├── TestData/                 # Test veri dosyaları
└── pom.xml                   # Maven yapılandırma dosyası
```

## Önemli Dosya ve Klasörler (Key Files and Directories)

### `utilities/ConfigReader`
- `config.properties` dosyasını okuyarak proje boyunca kullanılabilecek yapılandırma değerlerini sağlar.

### `utilities/Driver`
- WebDriver nesnesinin yönetimini sağlar ve singleton yapısını uygular.
- Testlerde kullanılan tarayıcı örneklerini oluşturur.

### `utilities/ExcelDataReader`
- Excel dosyalarından test verilerini okumak için yöntemler içerir.

### `utilities/OptionsMet`
- Appium testleri için gerekli olan özel ayarları yapılandırır.
- Örneğin, cihaz bilgileri ve uygulama ayarlarını içerir.

### `utilities/ReusableMethods`
- Test süreçlerinde sıkça kullanılan yöntemleri içerir (örneğin, ekran görüntüsü alma, bekleme işlemleri, dinamik öğe bulma).

### `resources/features`
- Cucumber senaryolarını içeren `.feature` dosyalarını barındırır.
- Her bir dosya, testlerin mantıksal adımlarını ve girdi çıktısını tanımlar.

## Appium Testleri (Appium Tests)
Appium testleri için gerekli yöntemler `utilities/ReusableMethods` ve `utilities/OptionsMet` sınıflarında tanımlanmıştır. Bu yöntemler, mobil uygulama testlerini kolaylaştırmak için kullanılabilir.

### Appium Kullanımı (Using Appium)
1. **OptionsMet:** Appium sürücüsü için gerekli olan ayarları içerir. Bu ayarları özelleştirerek farklı cihazlar ve platformlar için test yapabilirsiniz.
2. **ReusableMethods:** Mobil uygulama testi sırasında sık kullanılan işlemleri içerir. Örneğin:
   - Uygulamayı başlatma ve kapatma
   - Mobil öğelerle etkileşim kurma
   - Ekran görüntüsü alma

## Kurulum Adımları (Setup Instructions)

### Gerekli Ön Koşullar (Prerequisites)
1. **Java JDK 17** yüklü olmalıdır.
2. **Maven** yüklü olmalıdır.
3. **IntelliJ IDEA** gibi bir IDE önerilir.
4. **Git** yüklü olmalıdır.

### Kurulum (Installation)
1. Bu projeyi klonlayın:
   ```bash
   git clone <repository-url>
   ```

2. Proje klasörüne gidin:
   ```bash
   cd ApponteOtomasyon
   ```

3. Bağımlılıkları indirin:
   ```bash
   mvn clean install
   ```

## Kullanım Talimatları (Usage Instructions)

### Testlerin Çalıştırılması (Running the Tests)
1. **Runner** klasöründeki uygun `Runner` sınıfını çalıştırarak testleri başlatabilirsiniz.
2. Test sonuçlarını `console` veya `target` klasöründe oluşturulan raporlar üzerinden inceleyebilirsiniz.

### Özelleştirme (Customization)
- Test verilerini `TestData` klasöründen düzenleyebilirsiniz.
- Yeni sayfalar eklemek için `Pages` klasöründe yeni sınıflar oluşturabilirsiniz.
- Yeni step definition'lar eklemek için `stepdefinitions` klasörünü kullanabilirsiniz.
- `.feature` dosyalarını düzenleyerek yeni senaryolar ekleyebilirsiniz.

## Katkıda Bulunma (Contributing)
Bu projeye katkıda bulunmak isterseniz, lütfen önce bir konu açın ve değişiklik önerinizi tartışalım. Pull request'ler memnuniyetle kabul edilir.

## Lisans (License)
Bu proje açık kaynaklıdır ve [MIT Lisansı](LICENSE) ile lisanslanmıştır.
