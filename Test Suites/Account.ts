<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Test Case dari LoginValid dan LoginInvalid</description>
   <name>Account</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>159e62a1-7348-4ad1-9d63-1e4f0ed64873</testSuiteGuid>
   <testCaseLink>
      <guid>590167da-40d0-45d6-ac16-609706c0d1b1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Registrasi</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c55e2894-423d-4119-8c62-e0bea592cbcc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>6b4e9e4b-1863-4274-8cd9-9a773ae3060f</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginData/LoginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>6b4e9e4b-1863-4274-8cd9-9a773ae3060f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>0bbc9a15-8842-40c7-84ed-3f6d768f06e3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>6b4e9e4b-1863-4274-8cd9-9a773ae3060f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>46b589a6-4fc1-4c7f-83f4-361687fce7c2</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
