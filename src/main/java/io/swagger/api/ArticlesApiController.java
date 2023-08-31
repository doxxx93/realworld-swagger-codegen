package io.swagger.api;

import io.swagger.model.GenericErrorModel;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse201;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-31T04:49:45.091618529Z[GMT]")
@RestController
public class ArticlesApiController implements ArticlesApi {

    private static final Logger log = LoggerFactory.getLogger(ArticlesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ArticlesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse201> createArticle(@Parameter(in = ParameterIn.DEFAULT, description = "Article to create", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"article\" : {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> createArticleComment(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to create a comment for", required=true, schema=@Schema()) @PathVariable("slug") String slug,@Parameter(in = ParameterIn.DEFAULT, description = "Comment you want to create", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"comment\" : {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"id\" : 0,\n    \"body\" : \"body\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n  }\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> createArticleFavorite(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to favorite", required=true, schema=@Schema()) @PathVariable("slug") String slug) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"article\" : {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteArticle(@Parameter(in = ParameterIn.PATH, description = "Slug of the article to delete", required=true, schema=@Schema()) @PathVariable("slug") String slug) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteArticleComment(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to delete a comment for", required=true, schema=@Schema()) @PathVariable("slug") String slug,@Parameter(in = ParameterIn.PATH, description = "ID of the comment you want to delete", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> deleteArticleFavorite(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to unfavorite", required=true, schema=@Schema()) @PathVariable("slug") String slug) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"article\" : {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> getArticle(@Parameter(in = ParameterIn.PATH, description = "Slug of the article to get", required=true, schema=@Schema()) @PathVariable("slug") String slug) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"article\" : {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> getArticleComments(@Parameter(in = ParameterIn.PATH, description = "Slug of the article that you want to get comments for", required=true, schema=@Schema()) @PathVariable("slug") String slug) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"comments\" : [ {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"id\" : 0,\n    \"body\" : \"body\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"id\" : 0,\n    \"body\" : \"body\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ]\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> getArticles(@Parameter(in = ParameterIn.QUERY, description = "Filter by tag" ,schema=@Schema()) @Valid @RequestParam(value = "tag", required = false) String tag,@Parameter(in = ParameterIn.QUERY, description = "Filter by author (username)" ,schema=@Schema()) @Valid @RequestParam(value = "author", required = false) String author,@Parameter(in = ParameterIn.QUERY, description = "Filter by favorites of a user (username)" ,schema=@Schema()) @Valid @RequestParam(value = "favorited", required = false) String favorited,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The number of items to skip before starting to collect the result set." ,schema=@Schema(allowableValues={ "0" }
)) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(1)@Parameter(in = ParameterIn.QUERY, description = "The numbers of items to return." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"articlesCount\" : 6,\n  \"articles\" : [ {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }, {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  } ]\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> getArticlesFeed(@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The number of items to skip before starting to collect the result set." ,schema=@Schema(allowableValues={ "0" }
)) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(1)@Parameter(in = ParameterIn.QUERY, description = "The numbers of items to return." ,schema=@Schema(allowableValues={ "1" }, minimum="1"
, defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"articlesCount\" : 6,\n  \"articles\" : [ {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }, {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  } ]\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> updateArticle(@Parameter(in = ParameterIn.PATH, description = "Slug of the article to update", required=true, schema=@Schema()) @PathVariable("slug") String slug,@Parameter(in = ParameterIn.DEFAULT, description = "Article to update", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"article\" : {\n    \"tagList\" : [ \"tagList\", \"tagList\" ],\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"author\" : {\n      \"image\" : \"image\",\n      \"following\" : true,\n      \"bio\" : \"bio\",\n      \"username\" : \"username\"\n    },\n    \"description\" : \"description\",\n    \"title\" : \"title\",\n    \"body\" : \"body\",\n    \"favoritesCount\" : 0,\n    \"slug\" : \"slug\",\n    \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"favorited\" : true\n  }\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

}
