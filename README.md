# spring-ldap-auth-rest-api-example
Spring ldap authorization example for rest api

Set up necessary users credentials in test ldap server configured in ldap-user-server.ldif file.

Generate basic auth header for test user.

For example, for user "Vasja" and his password "vpassword" generate header "Authorization: Basic dmFzamE6dnBhc3N3b3Jk"

Use the header for rest api to pass authorization.  