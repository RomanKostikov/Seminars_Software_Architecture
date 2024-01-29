/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cloud;
import io.swagger.model.Clouds;
import io.swagger.model.Error;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-08T16:27:47.853155125Z[GMT]")
@Validated
public interface OrdersApi {

    @Operation(summary = "Метод отмены заказа на облако по ID", description = "", tags={ "Orders" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ с заказом с облаком по ID"),
        
        @ApiResponse(responseCode = "404", description = "Заказ с ID не найден", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/orders/{cloud_id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> canceledById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") String cloudId);


    @Operation(summary = "Создание заказа на облако", description = "", tags={ "Orders" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ со списком ресурсов в облаке", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Clouds.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/orders",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Clouds> createCloud(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Error body);


    @Operation(summary = "Метод получения заказа на облако по ID", description = "", tags={ "Orders" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Успешный ответ с заказом с облаком по ID", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Cloud.class))),
        
        @ApiResponse(responseCode = "404", description = "Заказ с ID не найден", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "Все остальное", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/orders/{cloud_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Cloud> getCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа облака", required=true, schema=@Schema()) @PathVariable("cloud_id") String cloudId);

}

