/*
 * API Title
 * OpenAPI for Todolist RESTful API
 *
 * OpenAPI spec version: 2.0
 * Contact: kanza.az.zahrawani28@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CreateOrUpdateTodolist;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Todolist;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for todolistTodolistIdDelete
     * @param todolistId Todolist for updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call todolistTodolistIdDeleteCall(String todolistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/todolist/{todolistId}"
            .replaceAll("\\{" + "todolistId" + "\\}", apiClient.escapeString(todolistId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "TodolistAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call todolistTodolistIdDeleteValidateBeforeCall(String todolistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'todolistId' is set
        if (todolistId == null) {
            throw new ApiException("Missing the required parameter 'todolistId' when calling todolistTodolistIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = todolistTodolistIdDeleteCall(todolistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete existing todolist
     * Delete existing todolist in databases
     * @param todolistId Todolist for updated (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 todolistTodolistIdDelete(String todolistId) throws ApiException {
        ApiResponse<InlineResponse200> resp = todolistTodolistIdDeleteWithHttpInfo(todolistId);
        return resp.getData();
    }

    /**
     * Delete existing todolist
     * Delete existing todolist in databases
     * @param todolistId Todolist for updated (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> todolistTodolistIdDeleteWithHttpInfo(String todolistId) throws ApiException {
        com.squareup.okhttp.Call call = todolistTodolistIdDeleteValidateBeforeCall(todolistId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete existing todolist (asynchronously)
     * Delete existing todolist in databases
     * @param todolistId Todolist for updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call todolistTodolistIdDeleteAsync(String todolistId, final ApiCallback<InlineResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = todolistTodolistIdDeleteValidateBeforeCall(todolistId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for todolistTodolistIdPut
     * @param body  (required)
     * @param todolistId Todolist for updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call todolistTodolistIdPutCall(CreateOrUpdateTodolist body, String todolistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/todolist/{todolistId}"
            .replaceAll("\\{" + "todolistId" + "\\}", apiClient.escapeString(todolistId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "TodolistAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call todolistTodolistIdPutValidateBeforeCall(CreateOrUpdateTodolist body, String todolistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling todolistTodolistIdPut(Async)");
        }
        // verify the required parameter 'todolistId' is set
        if (todolistId == null) {
            throw new ApiException("Missing the required parameter 'todolistId' when calling todolistTodolistIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = todolistTodolistIdPutCall(body, todolistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * update existing todolist
     * Update existing todolist indatabases
     * @param body  (required)
     * @param todolistId Todolist for updated (required)
     * @return Todolist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Todolist todolistTodolistIdPut(CreateOrUpdateTodolist body, String todolistId) throws ApiException {
        ApiResponse<Todolist> resp = todolistTodolistIdPutWithHttpInfo(body, todolistId);
        return resp.getData();
    }

    /**
     * update existing todolist
     * Update existing todolist indatabases
     * @param body  (required)
     * @param todolistId Todolist for updated (required)
     * @return ApiResponse&lt;Todolist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Todolist> todolistTodolistIdPutWithHttpInfo(CreateOrUpdateTodolist body, String todolistId) throws ApiException {
        com.squareup.okhttp.Call call = todolistTodolistIdPutValidateBeforeCall(body, todolistId, null, null);
        Type localVarReturnType = new TypeToken<Todolist>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update existing todolist (asynchronously)
     * Update existing todolist indatabases
     * @param body  (required)
     * @param todolistId Todolist for updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call todolistTodolistIdPutAsync(CreateOrUpdateTodolist body, String todolistId, final ApiCallback<Todolist> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = todolistTodolistIdPutValidateBeforeCall(body, todolistId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Todolist>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
