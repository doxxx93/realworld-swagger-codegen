/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GenericErrorModel;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse201;
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
public interface ArticlesApi {

    @Operation(summary = "Create an article", description = "Create an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Articles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Single article", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> createArticle(@Parameter(in = ParameterIn.DEFAULT, description = "Article to create", required=true, schema=@Schema()) @Valid @RequestBody Object body);


    @Operation(summary = "Create a comment for an article", description = "Create a comment for an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Comments" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Single comment", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2004.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}/comments",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2004> createArticleComment(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to create a comment for", required=true, schema=@Schema()) @PathVariable("slug") String slug, @Parameter(in = ParameterIn.DEFAULT, description = "Comment you want to create", required=true, schema=@Schema()) @Valid @RequestBody Object body);


    @Operation(summary = "Favorite an article", description = "Favorite an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Favorites" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Single article", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}/favorite",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> createArticleFavorite(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to favorite", required=true, schema=@Schema()) @PathVariable("slug") String slug);


    @Operation(summary = "Delete an article", description = "Delete an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Articles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "No content"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteArticle(@Parameter(in = ParameterIn.PATH, description = "Slug of the article to delete", required=true, schema=@Schema()) @PathVariable("slug") String slug);


    @Operation(summary = "Delete a comment for an article", description = "Delete a comment for an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Comments" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "No content"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}/comments/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteArticleComment(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to delete a comment for", required=true, schema=@Schema()) @PathVariable("slug") String slug, @Parameter(in = ParameterIn.PATH, description = "ID of the comment you want to delete", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Unfavorite an article", description = "Unfavorite an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Favorites" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Single article", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}/favorite",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<InlineResponse201> deleteArticleFavorite(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to unfavorite", required=true, schema=@Schema()) @PathVariable("slug") String slug);


    @Operation(summary = "Get an article", description = "Get an article. Auth not required", tags={ "Articles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Single article", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse201> getArticle(@Parameter(in = ParameterIn.PATH, description = "Slug of the article to get", required=true, schema=@Schema()) @PathVariable("slug") String slug);


    @Operation(summary = "Get comments for an article", description = "Get the comments for an article. Auth is optional", tags={ "Comments" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Multiple comments", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2003.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}/comments",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2003> getArticleComments(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to get comments for", required=true, schema=@Schema()) @PathVariable("slug") String slug);


    @Operation(summary = "Get recent articles globally", description = "Get most recent articles globally. Use query parameters to filter results. Auth is optional", tags={ "Articles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Multiple articles", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2002.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2002> getArticles(@Parameter(in = ParameterIn.QUERY, description = "Filter by tag" ,schema=@Schema()) @Valid @RequestParam(value = "tag", required = false) String tag, @Parameter(in = ParameterIn.QUERY, description = "Filter by author (username)" ,schema=@Schema()) @Valid @RequestParam(value = "author", required = false) String author, @Parameter(in = ParameterIn.QUERY, description = "Filter by favorites of a user (username)" ,schema=@Schema()) @Valid @RequestParam(value = "favorited", required = false) String favorited, @Min(0)@Parameter(in = ParameterIn.QUERY, description = "The number of items to skip before starting to collect the result set." ,schema=@Schema(allowableValues={ "0" }
)) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Min(1)@Parameter(in = ParameterIn.QUERY, description = "The numbers of items to return." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit);


    @Operation(summary = "Get recent articles from users you follow", description = "Get most recent articles from users you follow. Use query parameters to limit. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Articles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Multiple articles", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2002.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/feed",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2002> getArticlesFeed(@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The number of items to skip before starting to collect the result set." ,schema=@Schema(allowableValues={ "0" }
)) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Min(1)@Parameter(in = ParameterIn.QUERY, description = "The numbers of items to return." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit);


    @Operation(summary = "Update an article", description = "Update an article. Auth is required", security = {
        @SecurityRequirement(name = "Token")    }, tags={ "Articles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Single article", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "422", description = "Unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenericErrorModel.class))) })
    @RequestMapping(value = "/articles/{slug}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse201> updateArticle(@Parameter(in = ParameterIn.PATH, description = "Slug of the article to update", required=true, schema=@Schema()) @PathVariable("slug") String slug, @Parameter(in = ParameterIn.DEFAULT, description = "Article to update", required=true, schema=@Schema()) @Valid @RequestBody Object body);

}

