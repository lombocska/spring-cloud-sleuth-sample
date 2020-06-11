# Example for Spring Cloud Sleuth 

## Let's have a case, real-life example
 
You have microservices structured system with nginx. An x-super-request-id was introduced via nginx
and your team would like to apply `distributed tracing` and use the nginx custom trace id instead of the Spring Cloud Sleuth
generated traceId.  
Probably you have both HTTP and Messaging communication.

In microservices architecture, a single business operation might trigger a chain of downstream microservice calls 
and such interactions between the services can be challenging debugging. 

To make things easier, we can use Spring Cloud Sleuth + Zipkin(Brave) to enhance the application logs with tracing details.

## Examples

In this repo you can find 2 examples for distributed tracing and latency analysis.
"only-sleuth" shows how can you use the sleuth dependency for distributed tracing if you do not want to see latency analysis.
"sleuth-zipkin-elk" let you know how can you apply both sleuth and zipkin in a microservices architecture spiced with ELK stack as an extra. :) 

## INSPIRATIONS

Spring.io Bridge virtual Conference second quiz
[2017 SpringOne Conference Pivotal San Fransisco](https://tanzu.vmware.com/content/springone-platform-2017/distributed-tracing-latency-analysis-for-your-microservices-grzejszczak-krishna)
//@MGrzejszczak and Reshmi Krishna//