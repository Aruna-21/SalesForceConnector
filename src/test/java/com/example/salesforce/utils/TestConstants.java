package com.example.salesforce.utils;

public class TestConstants {
    public static final String GET_SALESFORCE_DATA="./src/test/resources/salesforce.json";
    public static final String GET_SALESFORCE_ENDPOINT="/salesforce/data";
    public static final String GET_SALESFORCE_ERROR="/salesforce/";
    public static final String ACCESS_TOKEN="00D5g00000KLQQg!AQcAQOoCoyd0CWnSjOZDf.IxUkQjy404koKjh0bpJ21PsAJ7Q13E4HKNkFPxaG5QCoYAbdduzbjeNYdboEP8i1OUSA1huCVk";
    public static final String ACCESS_ERROR="";
    public static final String SALESFORCE_RESPONS=" ";
    public static final String SALESFORCE_RESPONSE="{\n" +
            "    \"actionOverrides\": [],\n" +
            "    \"activateable\": false,\n" +
            "    \"associateEntityType\": null,\n" +
            "    \"associateParentEntity\": null,\n" +
            "    \"childRelationships\": [],\n" +
            "    \"compactLayoutable\": false,\n" +
            "    \"createable\": false,\n" +
            "    \"custom\": false,\n" +
            "    \"customSetting\": false,\n" +
            "    \"deepCloneable\": false,\n" +
            "    \"defaultImplementation\": null,\n" +
            "    \"deletable\": false,\n" +
            "    \"deprecatedAndHidden\": false,\n" +
            "    \"extendedBy\": null,\n" +
            "    \"extendsInterfaces\": null,\n" +
            "    \"feedEnabled\": false,\n" +
            "    \"fields\": [\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 18,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": true,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Event Log File ID\",\n" +
            "            \"length\": 18,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"Id\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"tns:ID\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"id\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": false,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": false,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Deleted\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"IsDeleted\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:boolean\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"boolean\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Created Date\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"CreatedDate\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:dateTime\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"datetime\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 18,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Created By ID\",\n" +
            "            \"length\": 18,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"CreatedById\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [\n" +
            "                \"User\"\n" +
            "            ],\n" +
            "            \"relationshipName\": \"CreatedBy\",\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"tns:ID\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"reference\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Last Modified Date\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LastModifiedDate\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:dateTime\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"datetime\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 18,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Last Modified By ID\",\n" +
            "            \"length\": 18,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LastModifiedById\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [\n" +
            "                \"User\"\n" +
            "            ],\n" +
            "            \"relationshipName\": \"LastModifiedBy\",\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"tns:ID\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"reference\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": true,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"System Modstamp\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"SystemModstamp\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:dateTime\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"datetime\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 765,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Event Type\",\n" +
            "            \"length\": 255,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"EventType\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"API\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"API\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Api Total Usage\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApiTotalUsage\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Apex Callout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApexCallout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Apex Execution\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApexExecution\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Apex REST API\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApexRestApi\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Apex SOAP\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApexSoap\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Apex Trigger\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApexTrigger\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Apex Unexpected Exception\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ApexUnexpectedException\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Asynchronous Report Run\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"AsyncReportRun\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"CORS Violation Record\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"CorsViolation\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Aura Request\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"AuraRequest\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Concurrent Long Running Apex Limit\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ConcurrentLongRunningApexLimit\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Continuation Callout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ContinuationCallout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"External Cross-Org Callout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ExternalCrossOrgCallout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"External Custom Apex Callout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ExternalCustomApexCallout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"External Data Source Callout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ExternalDataSourceCallout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"External OData Callout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ExternalODataCallout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Bulk API\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"BulkApi\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Bulk API 2.0\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"BulkApi2\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Change Set Operation\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ChangeSetOperation\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Console\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Console\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Content Distribution\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ContentDistribution\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Content Document Link\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ContentDocumentLink\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Content Transfer\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ContentTransfer\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Dashboard\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Dashboard\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Document Attachment Downloads\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"DocumentAttachmentDownloads\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Flow Execution\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"FlowExecution\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Group Membership\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"GroupMembership\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Hostname Redirects\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"HostnameRedirects\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Insecure External Assets\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"InsecureExternalAssets\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Insufficient Access\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"InsufficientAccess\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Knowledge Article View\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"KnowledgeArticleView\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Lightning Error\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"LightningError\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Lightning Interaction\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"LightningInteraction\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Lightning Logger\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"LightningLogger\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Lightning Page View\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"LightningPageView\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Lightning Performance\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"LightningPerformance\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Login\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Login\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Login As\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"LoginAs\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Logout\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Logout\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Metadata API Operation\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"MetadataApiOperation\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Multiblock Report\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"MultiBlockReport\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Named Credential\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"NamedCredential\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"One Commerce Usage\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"OneCommerceUsage\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Package Install\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"PackageInstall\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Queued Execution\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"QueuedExecution\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Report\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Report\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Report Export\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"ReportExport\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Rest API\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"RestApi\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Sandbox\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Sandbox\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Search\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Search\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Search Click\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"SearchClick\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Sites\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Sites\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Platform Encryption\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"PlatformEncryption\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Time-Based Workflow\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"TimeBasedWorkflow\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Transaction Security\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"TransactionSecurity\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"UI Tracking\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"UITracking\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"URI\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"URI\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Visualforce Request\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"VisualforceRequest\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Wave Change\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"WaveChange\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Wave Download\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"WaveDownload\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Wave Interaction\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"WaveInteraction\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Wave Performance\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"WavePerformance\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": true,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:string\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"picklist\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Log Date\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LogDate\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:dateTime\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"datetime\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Log File Length\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LogFileLength\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 18,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:double\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"double\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 765,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Log File Content Type\",\n" +
            "            \"length\": 255,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LogFileContentType\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:string\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"string\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"API Version\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"ApiVersion\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 18,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 1,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:double\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"double\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 9,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Sequence\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"Sequence\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:int\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"int\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 765,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": true,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": true,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Interval\",\n" +
            "            \"length\": 255,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"Interval\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": true,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Hourly\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Hourly\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"active\": true,\n" +
            "                    \"defaultValue\": false,\n" +
            "                    \"label\": \"Daily\",\n" +
            "                    \"validFor\": null,\n" +
            "                    \"value\": \"Daily\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": true,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:string\",\n" +
            "            \"sortable\": true,\n" +
            "            \"type\": \"picklist\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 3999,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": false,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Log File Field Names\",\n" +
            "            \"length\": 1333,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LogFileFieldNames\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": true,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:string\",\n" +
            "            \"sortable\": false,\n" +
            "            \"type\": \"string\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": true,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 3999,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": false,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Log File Field Types\",\n" +
            "            \"length\": 1333,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LogFileFieldTypes\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": true,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:string\",\n" +
            "            \"sortable\": false,\n" +
            "            \"type\": \"string\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"aggregatable\": false,\n" +
            "            \"aiPredictionField\": false,\n" +
            "            \"autoNumber\": false,\n" +
            "            \"byteLength\": 0,\n" +
            "            \"calculated\": false,\n" +
            "            \"calculatedFormula\": null,\n" +
            "            \"cascadeDelete\": false,\n" +
            "            \"caseSensitive\": false,\n" +
            "            \"compoundFieldName\": null,\n" +
            "            \"controllerName\": null,\n" +
            "            \"createable\": false,\n" +
            "            \"custom\": false,\n" +
            "            \"defaultValue\": null,\n" +
            "            \"defaultValueFormula\": null,\n" +
            "            \"defaultedOnCreate\": false,\n" +
            "            \"dependentPicklist\": false,\n" +
            "            \"deprecatedAndHidden\": false,\n" +
            "            \"digits\": 0,\n" +
            "            \"displayLocationInDecimal\": false,\n" +
            "            \"encrypted\": false,\n" +
            "            \"externalId\": false,\n" +
            "            \"extraTypeInfo\": null,\n" +
            "            \"filterable\": false,\n" +
            "            \"filteredLookupInfo\": null,\n" +
            "            \"formulaTreatNullNumberAsZero\": false,\n" +
            "            \"groupable\": false,\n" +
            "            \"highScaleNumber\": false,\n" +
            "            \"htmlFormatted\": false,\n" +
            "            \"idLookup\": false,\n" +
            "            \"inlineHelpText\": null,\n" +
            "            \"label\": \"Log File\",\n" +
            "            \"length\": 0,\n" +
            "            \"mask\": null,\n" +
            "            \"maskType\": null,\n" +
            "            \"name\": \"LogFile\",\n" +
            "            \"nameField\": false,\n" +
            "            \"namePointing\": false,\n" +
            "            \"nillable\": false,\n" +
            "            \"permissionable\": false,\n" +
            "            \"picklistValues\": [],\n" +
            "            \"polymorphicForeignKey\": false,\n" +
            "            \"precision\": 0,\n" +
            "            \"queryByDistance\": false,\n" +
            "            \"referenceTargetField\": null,\n" +
            "            \"referenceTo\": [],\n" +
            "            \"relationshipName\": null,\n" +
            "            \"relationshipOrder\": null,\n" +
            "            \"restrictedDelete\": false,\n" +
            "            \"restrictedPicklist\": false,\n" +
            "            \"scale\": 0,\n" +
            "            \"searchPrefilterable\": false,\n" +
            "            \"soapType\": \"xsd:base64Binary\",\n" +
            "            \"sortable\": false,\n" +
            "            \"type\": \"base64\",\n" +
            "            \"unique\": false,\n" +
            "            \"updateable\": false,\n" +
            "            \"writeRequiresMasterRead\": false\n" +
            "        }\n" +
            "    ],\n" +
            "    \"hasSubtypes\": false,\n" +
            "    \"implementedBy\": null,\n" +
            "    \"implementsInterfaces\": null,\n" +
            "    \"isInterface\": false,\n" +
            "    \"isSubtype\": false,\n" +
            "    \"keyPrefix\": \"0AT\",\n" +
            "    \"label\": \"Event Log File\",\n" +
            "    \"labelPlural\": \"Event Log Files\",\n" +
            "    \"layoutable\": false,\n" +
            "    \"listviewable\": null,\n" +
            "    \"lookupLayoutable\": null,\n" +
            "    \"mergeable\": false,\n" +
            "    \"mruEnabled\": false,\n" +
            "    \"name\": \"EventLogFile\",\n" +
            "    \"namedLayoutInfos\": [],\n" +
            "    \"networkScopeFieldName\": null,\n" +
            "    \"queryable\": true,\n" +
            "    \"recordTypeInfos\": [],\n" +
            "    \"replicateable\": false,\n" +
            "    \"retrieveable\": true,\n" +
            "    \"searchLayoutable\": false,\n" +
            "    \"searchable\": false,\n" +
            "    \"sobjectDescribeOption\": \"FULL\",\n" +
            "    \"supportedScopes\": [\n" +
            "        {\n" +
            "            \"label\": \"All event log files\",\n" +
            "            \"name\": \"everything\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"triggerable\": false,\n" +
            "    \"undeletable\": false,\n" +
            "    \"updateable\": false,\n" +
            "    \"urls\": {\n" +
            "        \"rowTemplate\": \"/services/data/v59.0/sobjects/EventLogFile/{ID}\",\n" +
            "        \"describe\": \"/services/data/v59.0/sobjects/EventLogFile/describe\",\n" +
            "        \"sobject\": \"/services/data/v59.0/sobjects/EventLogFile\"\n" +
            "    }\n" +
            "}";

}
