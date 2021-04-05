package com.sumit.pack.api;

import com.sumit.pack.ApiClient;

import com.sumit.pack.models.Employee;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("com.sumit.pack.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * 
     * 
     * <p><b>200</b> - returning all the employees data
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> employeeGet() throws RestClientException {
        return employeeGetWithHttpInfo().getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - returning all the employees data
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> employeeGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/employee", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - returning deleted employee
     * @param id Employee id to delete employee in (required)
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> employeeIdDelete(Employee id) throws RestClientException {
        return employeeIdDeleteWithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - returning deleted employee
     * @param id Employee id to delete employee in (required)
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> employeeIdDeleteWithHttpInfo(Employee id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling employeeIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/employee/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * returning all emplyoees with names
     * <p><b>200</b> - success response
     * @param id  (required)
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> employeeIdGet(Integer id) throws RestClientException {
        return employeeIdGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * returning all emplyoees with names
     * <p><b>200</b> - success response
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> employeeIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling employeeIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/employee/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * returning all emplyoees with names
     * <p><b>200</b> - success response
     * @param name  (required)
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> employeeNameGet(String name) throws RestClientException {
        return employeeNameGetWithHttpInfo(name).getBody();
    }

    /**
     * 
     * returning all emplyoees with names
     * <p><b>200</b> - success response
     * @param name  (required)
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> employeeNameGetWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling employeeNameGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/employee/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - returning inserted employee
     * @param employee  (optional)
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> employeePost(List<Employee> employee) throws RestClientException {
        return employeePostWithHttpInfo(employee).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - returning inserted employee
     * @param employee  (optional)
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> employeePostWithHttpInfo(List<Employee> employee) throws RestClientException {
        Object postBody = employee;
        
        String path = apiClient.expandPath("/employee", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * put operation
     * <p><b>200</b> - returning inserted employee
     * @param employee  (optional)
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> employeePut(List<Employee> employee) throws RestClientException {
        return employeePutWithHttpInfo(employee).getBody();
    }

    /**
     * 
     * put operation
     * <p><b>200</b> - returning inserted employee
     * @param employee  (optional)
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> employeePutWithHttpInfo(List<Employee> employee) throws RestClientException {
        Object postBody = employee;
        
        String path = apiClient.expandPath("/employee", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
