// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Sku model. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * The type of Redis cache to deploy. Valid values: (Basic, Standard,
     * Premium)
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P =
     * Premium).
     */
    @JsonProperty(value = "family", required = true)
    private SkuFamily family;

    /*
     * The size of the Redis cache to deploy. Valid values: for C
     * (Basic/Standard) family (0, 1, 2, 3, 4, 5, 6), for P (Premium) family
     * (1, 2, 3, 4).
     */
    @JsonProperty(value = "capacity", required = true)
    private int capacity;

    /**
     * Get the name property: The type of Redis cache to deploy. Valid values: (Basic, Standard, Premium).
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The type of Redis cache to deploy. Valid values: (Basic, Standard, Premium).
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the family property: The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
     *
     * @return the family value.
     */
    public SkuFamily family() {
        return this.family;
    }

    /**
     * Set the family property: The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
     *
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(SkuFamily family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: The size of the Redis cache to deploy. Valid values: for C (Basic/Standard) family (0,
     * 1, 2, 3, 4, 5, 6), for P (Premium) family (1, 2, 3, 4).
     *
     * @return the capacity value.
     */
    public int capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The size of the Redis cache to deploy. Valid values: for C (Basic/Standard) family (0,
     * 1, 2, 3, 4, 5, 6), for P (Premium) family (1, 2, 3, 4).
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
        if (family() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property family in model Sku"));
        }
    }
}
