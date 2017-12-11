org.springframework.cloud.contract.spec.Contract.make {
  request {
    method 'GET'
    url '/greeting'
  }
  response {
  	status 200
  	body("Hello worlds!")
  }
}