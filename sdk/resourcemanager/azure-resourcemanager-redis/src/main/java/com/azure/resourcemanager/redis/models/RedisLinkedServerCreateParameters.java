// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RedisLinkedServerCreateParameters model. */
@JsonFlatten
@Fluent
public class RedisLinkedServerCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisLinkedServerCreateParameters.class);

    /*
     * Fully qualified resourceId of the linked redis cache.
     */
    @JsonProperty(value = "properties.linkedRedisCacheId", required = true)
    private String linkedRedisCacheId;

    /*
     * Location of the linked redis cache.
     */
    @JsonProperty(value = "properties.linkedRedisCacheLocation", required = true)
    private String linkedRedisCacheLocation;

    /*
     * Role of the linked server.
     */
    @JsonProperty(value = "properties.serverRole", required = true)
    private ReplicationRole serverRole;

    /**
     * Get the linkedRedisCacheId property: Fully qualified resourceId of the linked redis cache.
     *
     * @return the linkedRedisCacheId value.
     */
    public String linkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }

    /**
     * Set the linkedRedisCacheId property: Fully qualified resourceId of the linked redis cache.
     *
     * @param linkedRedisCacheId the linkedRedisCacheId value to set.
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters withLinkedRedisCacheId(String linkedRedisCacheId) {
        this.linkedRedisCacheId = linkedRedisCacheId;
        return this;
    }

    /**
     * Get the linkedRedisCacheLocation property: Location of the linked redis cache.
     *
     * @return the linkedRedisCacheLocation value.
     */
    public String linkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }

    /**
     * Set the linkedRedisCacheLocation property: Location of the linked redis cache.
     *
     * @param linkedRedisCacheLocation the linkedRedisCacheLocation value to set.
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters withLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
        this.linkedRedisCacheLocation = linkedRedisCacheLocation;
        return this;
    }

    /**
     * Get the serverRole property: Role of the linked server.
     *
     * @return the serverRole value.
     */
    public ReplicationRole serverRole() {
        return this.serverRole;
    }

    /**
     * Set the serverRole property: Role of the linked server.
     *
     * @param serverRole the serverRole value to set.
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters withServerRole(ReplicationRole serverRole) {
        this.serverRole = serverRole;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedRedisCacheId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedRedisCacheId in model RedisLinkedServerCreateParameters"));
        }
        if (linkedRedisCacheLocation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedRedisCacheLocation in model"
                            + " RedisLinkedServerCreateParameters"));
        }
        if (serverRole() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serverRole in model RedisLinkedServerCreateParameters"));
        }
    }
}
