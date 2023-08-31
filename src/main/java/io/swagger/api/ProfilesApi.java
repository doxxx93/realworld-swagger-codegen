/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GenericErrorModel;
import io.swagger.model.InlineResponse2001;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-31T04:49:45.091618529Z[GMT]")
@Validated
public interface ProfilesApi {

    @Operation(summary = "Follow a user", description = "Follow a user by username", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Profile", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/profiles/{username}/follow",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2001> followUserByUsername(@Parameter(in = ParameterIn.PATH, description = "Username of the profile you want to follow", required=true, schema=@Schema()) @PathVariable("username") String username);


    @Operation(summary = "Get a profile", description = "Get a profile of a user of the system. Auth is optional", tags={ "Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Profile", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/profiles/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> getProfileByUsername(@Parameter(in = ParameterIn.PATH, description = "Username of the profile to get", required=true, schema=@Schema()) @PathVariable("username") String username);


    @Operation(summary = "Unfollow a user", description = "Unfollow a user by username", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Profile", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/profiles/{username}/follow",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<InlineResponse2001> unfollowUserByUsername(@Parameter(in = ParameterIn.PATH, description = "Username of the profile you want to unfollow", required=true, schema=@Schema()) @PathVariable("username") String username);

}
