@mobile
     Feature: Mobile Test
       Background: app is lunched on sandbox environment
         Given user should be on sandbox environment
         Given user successfully logged in with valid credentials

       Scenario: user is going to send a parcel to the client
         When user create delivery request by setting pick up location
         When user set schedule for the delivery
         When user set the drop off location
         When user taps on continue button
         Then user will see transport options and select bike
         When user tap on Request Now button
         Then system is going to assign a carrier for the delivery
         When user cancel delivery should see message for cancellation
         When user confirm cancellation will see popup message
         Then user can validate delivery cancelled on Finished page





