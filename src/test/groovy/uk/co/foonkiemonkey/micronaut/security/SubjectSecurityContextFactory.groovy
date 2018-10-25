package uk.co.foonkiemonkey.micronaut.security

import io.jsonwebtoken.Claims

class SubjectSecurityContextFactory implements SecurityContextFactory {
    @Override
    SecurityContext createSecurityContext(Claims tokenContent) {
        new SubjectSecurityContext(tokenContent.get("sub"))
    }
}
