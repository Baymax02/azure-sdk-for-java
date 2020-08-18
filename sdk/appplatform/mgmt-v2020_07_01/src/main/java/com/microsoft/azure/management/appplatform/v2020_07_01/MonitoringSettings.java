/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import rx.Observable;
import com.microsoft.azure.management.appplatform.v2020_07_01.implementation.MonitoringSettingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing MonitoringSettings.
 */
public interface MonitoringSettings extends HasInner<MonitoringSettingsInner> {
    /**
     * Get the Monitoring Setting and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MonitoringSettingResource> getAsync(String resourceGroupName, String serviceName);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MonitoringSettingResource> updatePutAsync(String resourceGroupName, String serviceName);

    /**
     * Update the Monitoring Setting.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MonitoringSettingResource> updatePatchAsync(String resourceGroupName, String serviceName);

}
