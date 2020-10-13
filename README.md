# Spring-Cloud-Function-AWS
Spring-Cloud-Function to deploy on AWS Lambda with the help of API Gateway(REST Endpoint)

## Note:
Don't forget to register  "com.icitinstitute.AwsLambdaHandler" handler with AWS Lambda.

## Step
1. Create a lambda function with any name from AWS console
    ### Basic information
    1. Function name: (ex. Spring-Cloud-Function)
    2. Runtime: Java 8

2. Add Trigger
    ### Trigger configuration
    1. Select A trigger (Select API Gateway)
    2. API (create a new API or attach an existing one)-> Select Create an API
    3. API Type -> Select REST API
    4. Security -> Select Open
    Then click on "Add" button.

3. From "Designer" section click on Lambda icon and goto "Function code" section.
    From "Actions" dropdown Upload AWS version of your application jar.

4. Goto "Basic settings" and click on edit.
    Into the "Handler" text box type full qualified path of your handler class ex. "com.icitinstitute.AwsLambdaHandler" is in this application.