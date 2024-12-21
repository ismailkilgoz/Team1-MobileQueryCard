Feature: [US_007] As a user, I would like to be able to register on the site to take advantage of its functions
  Background: User opens the app
    * User makes driver adjustments

#Pozitif senaryo
Scenario Outline: Successful Registration with Dynamic Email or Phone Field

  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign Up"
  And User clicks on the name button enters a valid "John Doe".
  And The user switches to "<input_type>" input field if needed
  And The user enters "<input_value>" in the input field
  And The user enters a valid password "Team123."
  * User clicks the button with description "Sign Up"
  Then The user should see a registration "Success Register Successfully." message
  * Driver turns off
  Examples:
  | input_type | input_value             |
  | Email      |john.doe+1@example.com   |
  | Email      |john_doe.123@example.com |
  | Phone      | 9876543210              |
  | Phone      | 1231231234              |

# Aynı Kullanıcıyla Tekrar Kayıt
  Scenario Outline: Duplicate registration with the same email or phone number
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    And The user switches to "<input_type>" input field if needed
    And The user enters an already registered "<input_value>"
    And The user enters a valid password "Team123."
    * User clicks the button with description Sign Up and should see a registration "<expected_message>" message by the "<input_type>".
    * Driver turns off
    Examples:
      | input_type | input_value          |expected_message|
      | Email      | john.doe@example.com |The email has already been taken.|
      | Phone      | 1234567890           |The phone has already been taken.|


  #Eksik Zorunlu Alanlar
  Scenario Outline: Missing required fields during registration
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User leaves "<field>" empty by "<input_type>" , clicks the button with description Sign Up and should see a validation message "<message>".
    * Driver turns off
    Examples:
      |input_type|field   |message               |
      |Email     |Name    |This field is required|
      |Email     |Email   |Email is required     |
      |Email     |Password|Passord is required   |
      |Phone     |Name    |This field is required|
      |Phone     |Phone   |This field is required|
      |Phone     |Password|Passord is required   |


  #Geçersiz E-posta Formatı
  Scenario Outline: Registration with invalid email format
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User enters valid "John Doe" in the name field
    And The user enters "<invalid_email>" in the email input field
    And The user enters a valid password "Team123."
    * User clicks the button with description "Sign Up"
    Then The user should see an error message "Invalid email format."
    Examples:
      | invalid_email       |
      | johndoe@example     |
      | johndoe@.com        |
      | @example.com        |
      | johndoeexample.com  |

  #Geçersiz Telefon Formatı

  Scenario Outline: Registration with invalid phone number format
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User enters valid "John Doe" in the name field
    And The user enters "<invalid_phone>" in the phone input field
    And The user enters a valid password "Team123."
    * User clicks the button with description "Sign Up"
    Then The user should see an error message "Invalid phone number format."
    Examples:
      | invalid_phone   |
      | 1234            |
      | abcdefghij      |
      | 12345678901     |
      | 0000000000      |


  #Kısa veya Zayıf Şifre Girişi
  Scenario Outline: Registration with weak or invalid password
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User enters valid "John Doe" in the name field
    And The user enters a valid email "john.doe@example.com"
    And The user enters "<weak_password>" as the password
    * User clicks the button with description "Sign Up"
    Then The user should see an error message "Password must be at least 6 characters."
    Examples:
      | weak_password |
      | 12345         |
      | abcd          |
      | 123abc        |
