package com.icitinstitute.functions;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

@Component
public class SayHelloFunction implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent>{

	@Override
	public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {
		APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setBody("Hello Friend I am responding from Spring Cloud AWS Lambda Function: " + apiGatewayProxyRequestEvent.getBody());
        responseEvent.setStatusCode(200);
        return responseEvent;
	}




}
