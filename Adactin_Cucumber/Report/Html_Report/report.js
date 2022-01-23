$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@module1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": ": Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;:-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#When user enters \"srinath21\" and \"Test@123\" in username and password field"
    }
  ],
  "line": 8,
  "name": "user click Login Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;:-login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;:-login-page;;1"
    },
    {
      "cells": [
        "aaa",
        "bbb"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;:-login-page;;2"
    },
    {
      "cells": [
        "123",
        "456"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;:-login-page;;3"
    },
    {
      "cells": [
        "srinath21",
        "Test@123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;:-login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": ": Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;:-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@module1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter \"aaa\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"bbb\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#When user enters \"srinath21\" and \"Test@123\" in username and password field"
    }
  ],
  "line": 8,
  "name": "user click Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4229642600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaa",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 230035900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bbb",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 80847300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_Login_Button()"
});
formatter.result({
  "duration": 442644400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": ": Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;:-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@module1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter \"123\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"456\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#When user enters \"srinath21\" and \"Test@123\" in username and password field"
    }
  ],
  "line": 8,
  "name": "user click Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 396794800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 113331300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 86391100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_Login_Button()"
});
formatter.result({
  "duration": 403690400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": ": Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;:-login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@module1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter \"srinath21\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"Test@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#When user enters \"srinath21\" and \"Test@123\" in username and password field"
    }
  ],
  "line": 8,
  "name": "user click Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 348853400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "srinath21",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 108432800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 105628700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_Login_Button()"
});
formatter.result({
  "duration": 1035177200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@module2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select Location From Location Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select Name Of Hotel from Hotel Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select Room Type From Room Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select Number Of Rooms From Number Of Rooms Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Number Of Adults Per Room From Adults Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select Number Of Children Per Room From Children Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_Location_From_Location_Dropdown()"
});
formatter.result({
  "duration": 174990700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Name_Of_Hotel_from_Hotel_Dropdown()"
});
formatter.result({
  "duration": 148138900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Room_Type_From_Room_Type_Dropdown()"
});
formatter.result({
  "duration": 173196700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown()"
});
formatter.result({
  "duration": 157768300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 111752400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 78586900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Adults_Per_Room_From_Adults_Per_Room_Dropdown()"
});
formatter.result({
  "duration": 142952700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Children_Per_Room_From_Children_Per_Room_Dropdown()"
});
formatter.result({
  "duration": 135521200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_Search_Button()"
});
formatter.result({
  "duration": 727488400,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Hotel Selection Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;hotel-selection-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@module3"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Select Hotel From List Of Hotels Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user click Continue Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_Hotel_From_List_Of_Hotels_Radio_Button()"
});
formatter.result({
  "duration": 88893600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_Continue_Button()"
});
formatter.result({
  "duration": 733462000,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Payment Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;payment-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@module4"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter Address in Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter Credit Card Number in Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select Credit Card Type From Credit Card Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select Credit Cardt Expiration Month From Expiration Month Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select Credit Card Expiration Year From Expiration Year Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter Credit Card CVV Number in CVV Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click Book Now Button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "user Click My Itinerary Button",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.user_Enter_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 116617600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 101169000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Address_in_Billing_Address_Field()"
});
formatter.result({
  "duration": 129612500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Credit_Card_Number_in_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 97086400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Credit_Card_Type_From_Credit_Card_Type_Dropdown()"
});
formatter.result({
  "duration": 152402400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Credit_Cardt_Expiration_Month_From_Expiration_Month_Dropdown()"
});
formatter.result({
  "duration": 152846200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Credit_Card_Expiration_Year_From_Expiration_Year_Dropdown()"
});
formatter.result({
  "duration": 147388300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Credit_Card_CVV_Number_in_CVV_Field()"
});
formatter.result({
  "duration": 87205200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Book_Now_Button()"
});
formatter.result({
  "duration": 65595300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_My_Itinerary_Button()"
});
formatter.result({
  "duration": 6718602700,
  "status": "passed"
});
});