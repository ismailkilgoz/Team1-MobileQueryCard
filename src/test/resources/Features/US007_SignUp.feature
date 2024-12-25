Feature: [US_007] As a user, I would like to be able to register on the site to take advantage of its functions

  Background: User opens the app

#Pozitif senaryo
@Outline
Scenario Outline: [US_007] TC01 Successful Registration with Dynamic Email or Phone Field
  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign Up"
  And User clicks on the name button enters a valid "John Doe".
  And The user switches to "<input_type>" input field if needed
  And The user enters "<input_value>" in the input field
  And The user enters a valid password "Team123."
  * User clicks the button Sign Up.
  Then The user should see a registration "Register Successfully." message
  * Driver turns off
  Examples:
  # change input_value !
  | input_type | input_value            |
  | Email      |john.doe+12@example.com |
  | Email      |john_doe.20@example.com |
  | Phone      | 5559878962569          |
  | Phone      | 3694567893236          |

# Aynı Kullanıcıyla Tekrar Kayıt
  @Outline
  Scenario Outline: [US_007] TC02  Duplicate registration with the same email or phone number
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
  @Outline
  Scenario Outline: [US_007] TC03 Missing required fields during registration
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
   @seren
  Scenario Outline: [US_007] TC04 Registration with invalid email format
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    And The user switches to Email input field if needed.
    And The user enters "<invalid_email>" in the input field
    And The user enters a valid password "Team123."
    * User clicks the button Sign Up.
    Then an error message "Enter Valid Email Address" should be displayed on singUp Page.
    * Driver turns off

    Examples:
         |invalid_email     |
         |johndoe@example   |
         |johndoe@.com      |
         |@example.com      |
         |johndoeexample.com|



  #Geçersiz Telefon Formatı


    # BUG
  @Outline
  Scenario Outline: [US_007] TC05 Registration with invalid phone number format
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    * User clicks tap coordinates 142, 877
    * User swipes to screen coordinates 251, 680, 251, 132
    * User swipes to screen coordinates 251, 680, 251, 132
    * User swipes to screen coordinates 251, 680, 251, 132
    * User swipes to screen coordinates 251, 680, 251, 132
    * User swipes to screen coordinates 251, 680, 251, 132
    * User swipes to screen coordinates 251, 680, 251, 132
    And User selects the country code +49
    And The user enters "<invalid_phone>" in the phone input field
    And The user enters a valid password "Team123."
    * User clicks the button Sign Up.
    Then the user should not see a success message.
    * Driver turns off
    Examples:
      | invalid_phone    |
      | abchlhuhttlpo    |
      | 09579951776      |
      | 000000000        |





  #Kısa veya Zayıf Şifre Girişi
  @Outline
  Scenario Outline: [US_007] TC06 Registration with weak or invalid password

    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    And User clicks on the name button enters a valid "John Doe".
    And The user switches to Email input field if needed.
    And The user enters "john.doe@example.com" in the input field
    And The user enters "<weak_password>" as the password
    * User clicks the button Sign Up.
    Then an error message "Password is short" should be displayed on singUp Page.
    * Driver turns off
    Examples:
      | weak_password |
      | 12354         |
      | abce          |

