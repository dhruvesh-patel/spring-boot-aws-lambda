This repo demonstrates how to create AWS Lambda function using spring cloud and spring boot application. AWS Lambda is a serverless computing service provided by Amazon to reduce efforts to build, manage and run servers. Here, you just upload your code and AWS will take care of provisioning cloud infrastructure.

Pre-requisite:
1) JDK 11
2) Eclipse / IntelliJ IDE 
3) Maven (if not part of IDE already)

Steps to Setup :

1. Create AWS Free-tier Account using https://portal.aws.amazon.com/billing/signup. 
```
Follow below steps to create lambda function. 
https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html
```

2. Clone the application
```
https://github.com/dhruvesh-patel/spring-boot-aws-lambda.git
```

3. Build and run the app using IDE / maven
```
mvn clean install 
mvn spring-boot:run
```
4. Use AWS Console to upload create jar to AWS Lambda function. 

5. Use AWS console to configure and test lambda function. 
```
Update basic Settings to configure handler with full path of - com.dpinc.springbootawslambda.OrderHandler
Edit Environment variable to add key as "FUNCTION_NAME" and put funnction name - orders ( Ltoater follow same steps to try with other function - findOrderByName)
Configure test event and provide input to function or leave blank (as per function definition)
Test function
```

When you do this, AWS Lambda will take care of cloud infrastructure provisioning and offers pay-as-you-go charging model. 



