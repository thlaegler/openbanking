'use strict';


/**
 * Get a Software Statement Assertion for the given SoftwareStatementID.
 * The response body is a signed JWT and the values found in the header and the payload of the SSA are specified below  # Terminology    This specification uses the terms \"access token\", \"authorization code\", \"authorization endpoint\", \"authorization grant\", \"authorization server\", \"client\", \"client identifier\", \"client secret\", \"grant type\", \"protected resource\", \"redirection URI\", \"refresh token\", \"resource owner\", \"resource server\", \"response type\", and \"token endpoint\" defined by OAuth 2.0 [RFC6749] and uses the term \"Claim\" defined by JSON Web Token (JWT) [RFC7519].    * __Account Servicing Payment Services Provider (ASPSP)__ -- An organisation managing customer accounts (and operating banking APIs).   * __Primary Technical Contact__ -- The person at the TPP who creates an SSA and invokes a registration mechanism. This is an example of an [RFC7591] Client Developer.   * __OB Organisation ID__ -- The unique identifier for each OpenBanking participant. Both TPPs and ASPSPs have OB Organisation IDs.   * __OpenBanking Directory__ -- An implementation of a [PSD2] competent authority; acts as an Identity Provider, certificate authority, and registry governing the participants in the UK OpenBanking API scheme.   * __ASPSP Registration Endpoint__ -- OAuth 2.0 & [RFC7591] compliant endpoint, exact value is discoverable from the [OIDCD] openid-configuration file of the ASPSP.   * __Software Statement Assertion (SSA)__ -- An implementation of an [RFC7591] software statement, signed by the OpenBanking Directory.   * __Trusted Third Party (TPP)__ -- An organization working to initiate payments or consume account information with/from an ASPSP.   * __TPP Client Software__ -- software implementing an OAuth2 client, interacting with an ASPSP registration endpoint.  # Software Statement Assertion (SSA)    The SSA is a JSON Web Token (JWT) containing client metadata about an instance of TPP client software. The JWT is issued and signed by the OpenBanking Directory.  ## SSA Payload    The payload of an OpenBanking SSA MUST be a compliant software statement according to [RFC7591]. The SSA MUST also be a compliant JWT according to [RFC7519]. The following metadata profiles the metadata in [RFC7591] and [RFC7519]:    | Metadata | Description | Source Specification |   |----------|-------------|----------------------|   |`software_id`|Unique Identifier for TPP Client Software|[RFC7591]|   |`iss`|SSA Issuer|[RFC7519]|   |`iat`|Time SSA issued|[RFC7519]|   |`jti`|JWT ID|[RFC7519]|    The following software metadata is additionally defined for this profile:    |Metadata |Description |Field Size |Default values |   |---------|------------|-----------|---------------|   |`software_client_id`|The Client ID Registered at OB used to access OB resources|Base62 GUID (22 chars)| |   |`software_client_description`|Human-readable detailed description of the client|Max256Text| |   |`software_client_name`|Human-readable Software Name|Max40Text| |   |`software_client_uri`|The website or resource root uri|Max256Text| |   |`software_version`|The version number of the software should a TPP choose to register and / or maintain it|decimal| |   |`software_environment`|Requested additional field to avoid certificate check|Max256Text| |   |`software_jwks_endpoint`|Contains all active signing and network certs for the software|Max256Text| |   |`software_jwks_revoked_endpoint`|Contains all revoked signing and network certs for the software|Max256Text| |   |`software_logo_uri`|Link to the TPP logo. Note, ASPSPs are not obliged to display images hosted by third parties|Max256Text| |   |`software_mode`|ASPSP Requested additional field to indicate that this software is `Test` or `Live` the default is `Live`. Impact and support for `Test` software is up to the ASPSP.|Max40Text| |   |`software_on_behalf_of_org`|A reference to fourth party organsiation resource on the OB Directory if the registering TPP is acting on behalf of another.|Max40Text| |   |`software_policy_uri`|A link to the software's policy page|Max256Text| |   |`software_redirect_uris`|Registered client callback endpoints as registered with Open Banking|A string array of Max256Text items|   |`software_roles`|A multi value list of PSD2 roles that this software is authorized to perform.|A string array of Max256Text items| |   |`software_tos_uri`|A link to the software's terms of service page|Max256Text| |    The following Organisational metadata is defined for this profile:    |Metadata |Description |Field Size | Default values |   |---------|------------|-----------|----------------|   |`organisation_competent_authority_claims`|Authorisations granted to the organsiation by an NCA|CodeList {`AISP`, `PISP`, `CBPII`, `ASPSP`}| |   |`org_status`|Included to cater for voluntary withdrawal from OB scenarios|`Active`, `Revoked`, or `Withdrawn`| |   |`org_id`|The Unique TPP or ASPSP ID held by OpenBanking.|Max35Text| |   |`org_name`|Legal Entity Identifier or other known organisation name|Max140Text| |   |`org_contacts`|JSON array of objects containing a triplet of name, email, and phone number|Each item Max256Text| |   |`org_jwks_endpoint`|Contains all active signing and network certs for the organisation|Max256Text| |   |`org_jwks_revoked_endpoint`|Contains all revoked signing and network certs for the organisation|Max256Text| |  ## SSA header    The SSA header MUST comply with [RFC7519].    |Metadata |Description |Comments |   |---------|------------|---------|   |`typ`|MUST be set to `JWT`| |   |`alg`|MUST be set to `ES256` or `PS256`| |   |`kid`|The kid will be kept the same as the `x5t` parameter. (X.509 Certificate SHA-1 Thumbprint) of the signing certificate.| |    ### Example SSA    The elements defined in the software statement will consist of the following values.    *Note that there are inconsistent applications of booleans or \"Active\" strings in the current data model.*    *Note that there are inconsistent applications of status flags case sensitivity.*    *The attributes required to be displayed by ASPSPs.*  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\" } {   \"iss\": \"OpenBanking Ltd\",   \"iat\": 1492756331,   \"jti\": \"id12345685439487678\",   \"software_environment\": \"production\",   \"software_mode\": \"live\",   \"software_id\": \"65d1f27c-4aea-4549-9c21-60e495a7a86f\",   \"software_client_id\": \"OpenBanking TPP Client Unique ID\",   \"software_client_name\": \"Amazon Prime Movies\",   \"software_client_description\": \"Amazon Prime Movies is a moving streaming service\",   \"software_version\": \"2.2\",   \"software_client_uri\": \"https://prime.amazon.com\",   \"software_redirect_uris\": [     \"https://prime.amazon.com/cb\",     \"https://prime.amazon.co.uk/cb\"   ],   \"software_roles\": [     \"PISP\",     \"AISP\"   ],   \"organisation_competent_authority_claims\": {     \"authority_id\": \"FMA\", // Austrian Financial Market Authority     \"registration_id\": \"111111\",     \"status\": \"Active\",     \"authorisations\":  [       {         \"member_state\": \"GB\",         \"roles\": [           \"PISP\",           \"AISP\"         ]       },       {         \"member_state\": \"IR\",         \"roles\": [           \"PISP\"         ]       }     ]   },   \"software_logo_uri\": \"https://prime.amazon.com/logo.png\",   \"org_status\": \"Active\",   \"org_id\": \"Amazon TPPID\",   \"org_name\": \"OpenBanking TPP Registered Name\",   \"org_contacts\": [     {       \"name\": \"contact name\",       \"email\": \"contact@contact.com\",       \"phone\": \"+447890130558\"       \"type\": \"business\"     },     {       \"name\": \"contact name\",       \"email\": \"contact@contact.com\",       \"phone\": \"+447890130558\",       \"type\": \"technical\"     }   ],   \"org_jwks_endpoint\": \"https://jwks.openbanking.org.uk/org_id/org_id.jkws\",   \"org_jwks_revoked_endpoint\": \"https://jwks.openbanking.org.uk/org_id/revoked/org_id.jkws\",   \"software_jwks_endpoint\": \"https://jwks.openbanking.org.uk/org_id/software_id.jkws\",   \"software_jwks_revoked_endpoint\": \"https://jwks.openbanking.org.uk/org_id/revoked/software_id.jkws\",   \"software_policy_uri\": \"https://tpp.com/policy.html\",   \"software_tos_uri\": \"https://tpp.com/tos.html\",   \"software_on_behalf_of_org\": \"Acme Ltd\" } {   Signature } ```  # Automated Client Registration  A TPP MAY use automated client registration to submit an SSA to an ASPSP in exchange for client credentials for use as a client against an OAuth 2.0 Authorization Server. It is RECOMMENDED for ASPSPs to support the automated client registration mechanism. A large number of claims that OpenID Connect OPs could support as part of the RFC7591 request are detailed [https://openid.net/specs/openid-connect-registration-1_0.html#ClientMetadata](https://openid.net/specs/openid-connect-registration-1_0.html#ClientMetadata) and should be followed if not explicitly referenced in the Software Statement Assertion claim set.  ## Request Validation  Prior to issuing a client registration response, the ASPSP MUST perform the following checks  * The ASPSP SHOULD check whether the TPP that initiated the TLS connection is the same TPP as listed in the SSA. * In the case where a gateway or other piece of infrastructure pre-terminates the MATLS channel in front of the registration endpoint, the certificate used to initiate the connection or some part of that certificate (such as DN & Issuer) SHOULD be made available to the ASPSP for validation against the claims in the SSA. * The registration request MUST be signed with a key contained in the JWKS referenced in the SSA included with the request. This ensures that a holder-of-key proof-of-possession is performed proving that the TPP app was the originally intended recipient of the SSA when the OB issued it. * The SSA MUST be validated according to [RFC7519], including validation of the signature and validity window.  JWT signature must be validated, this involves retrieving the jwks keyset for both the OB and the TPP. The OB keystore location will be published as part of the directory specification, The TPP's will be included in the software statement.  ### SSA Lifetime  The SSA's Lifetime / Validity period is not defined by Open Banking. ASPSPs in the Open Banking ecosystem are required to implement pragmatic time ranges in which to accept an SSA. For example, an ASPSP that has implemented Dynamic Client Registration may choose to accept SSA's that were issued no earlier than 1 minute prior to their presentation however ASPSPs that only support manual registration may need to accept SSAs that were issued 30 minutes prior as the elapsed time period between generation and use between these two flows is expected to differ significantly. 
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * softwareStatementId String The software statement ID
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdSoftware_statement_assertionGET = function(organisationType,organisationId,softwareStatementId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

