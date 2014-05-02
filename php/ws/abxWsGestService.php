<?php

include_once('abxProtocolResult.php');
include_once('abxProtocolList.php');
include_once('abxProtocol.php');
include_once('allDescription.php');
include_once('abxCan.php');
include_once('DeleteSDKTaskFieldMapping.php');
include_once('IDtype.php');
include_once('DeleteSDKTaskFieldMappingResponse.php');
include_once('abxSDKResult.php');
include_once('abxSDKTaskList.php');
include_once('abxSDKTask.php');
include_once('abxSDKWatchFolder.php');
include_once('abxSDKTaskFieldMapping.php');
include_once('abxSDKTaskFieldMappingRule.php');
include_once('abxSDKTaskExcelPreviewSheet.php');
include_once('abxSDKTaskExcelPreviewColumn.php');
include_once('abxSDKTaskExcelPreviewRow.php');
include_once('abxSDKTaskPDFPreview.php');
include_once('abxSDKTaskPDFImage.php');
include_once('abxSDKTaskValidateData.php');
include_once('abxSDKTaskValidateField.php');
include_once('abxSDKRuleList.php');
include_once('abxSDKRule.php');
include_once('abxSDKVariableList.php');
include_once('abxSDKVariable.php');
include_once('abxSDKWatchFolderDirectoryList.php');
include_once('abxSDKWatchFolderDirectory.php');
include_once('RemoveUserByAllGroups.php');
include_once('RemoveUserByAllGroupsResponse.php');
include_once('abxUserListResult.php');
include_once('abxUserList.php');
include_once('abxUser.php');
include_once('abxUserConfig.php');
include_once('abxGroupList.php');
include_once('abxGroup.php');
include_once('AddExpression.php');
include_once('abxExpression.php');
include_once('returnWrongKeys.php');
include_once('abxTranslation.php');
include_once('AddExpressionResponse.php');
include_once('abxExpressionResult.php');
include_once('abxExpressionList.php');
include_once('AddSign.php');
include_once('abxWorkflow.php');
include_once('processoDefUsers.php');
include_once('signList.php');
include_once('userSettings.php');
include_once('variables.php');
include_once('AddSignResponse.php');
include_once('abxWorkflowResult.php');
include_once('abxWorkflowList.php');
include_once('GetUserDetailByUsername.php');
include_once('GetUserDetailByUsernameResponse.php');
include_once('QueryTotAttach.php');
include_once('abxQexpression.php');
include_once('abxQnode.php');
include_once('abxQField.php');
include_once('abxField.php');
include_once('allOptionDescription.php');
include_once('extended.php');
include_once('abxPermission.php');
include_once('listCustom.php');
include_once('editPermission.php');
include_once('abxObjAction.php');
include_once('abxEditPermissionList.php');
include_once('abxEditPermission.php');
include_once('permissionSingleList.php');
include_once('abxQFieldRange.php');
include_once('abxOption4Query.php');
include_once('fieldList.php');
include_once('sortFieldList.php');
include_once('abxProtocolUse.php');
include_once('filters.php');
include_once('QueryTotAttachResponse.php');
include_once('abxRetQueryResult.php');
include_once('abxResultsList.php');
include_once('abxResults.php');
include_once('abxQcHeadList.php');
include_once('abxQcHead.php');
include_once('abxQrowList.php');
include_once('abxQrow.php');
include_once('canModifyRaccoglitore.php');
include_once('canModifyRaccoglitoreResponse.php');
include_once('GetFileListByCode.php');
include_once('GetFileListByCodeResponse.php');
include_once('abxFileResult.php');
include_once('abxFileList.php');
include_once('abxFile.php');
include_once('downloadData.php');
include_once('uploadData.php');
include_once('abxAllPermission.php');
include_once('DestroyRaccoglitore.php');
include_once('DestroyRaccoglitoreResponse.php');
include_once('abxRaccoglitoreResult.php');
include_once('abxTemplateList.php');
include_once('abxTemplate.php');
include_once('abxFieldList.php');
include_once('abxContainerList.php');
include_once('abxContainer.php');
include_once('parentDataID.php');
include_once('abxMasterDetail.php');
include_once('masterList.php');
include_once('detailList.php');
include_once('InsertUSFileWithUser.php');
include_once('InsertUSFileWithUserResponse.php');
include_once('GetSDKLogList.php');
include_once('abxLog.php');
include_once('GetSDKLogListResponse.php');
include_once('abxLogResult.php');
include_once('abxLogList.php');
include_once('Fk_getRemoteFieldList.php');
include_once('Fk_getRemoteFieldListResponse.php');
include_once('abxFKResult.php');
include_once('abxFKList.php');
include_once('abxFK.php');
include_once('abxFkDb.php');
include_once('abxFKDbRecord.php');
include_once('abxFKDbField.php');
include_once('abxFKFieldMap.php');
include_once('abxFKTableFields.php');
include_once('abxRmDatabaseList.php');
include_once('abxRmTableList.php');
include_once('abxRmViewList.php');
include_once('abxRmFieldList.php');
include_once('abxMultiFKList.php');
include_once('abxMultiFK.php');
include_once('abxFkArchiboxRacc.php');
include_once('abxFKRaccRecord.php');
include_once('abxFkArchiboxUtenti.php');
include_once('abxFKUtentiRecord.php');
include_once('abxFKUtentiField.php');
include_once('GetAllContainerExpressions.php');
include_once('GetAllContainerExpressionsResponse.php');
include_once('canDeleteDynorg.php');
include_once('canDeleteDynorgResponse.php');
include_once('GetDataTPFileListByContainer.php');
include_once('GetDataTPFileListByContainerResponse.php');
include_once('abxFileTpResult.php');
include_once('abxFileTpList.php');
include_once('abxFileTp.php');
include_once('bindingExcel.php');
include_once('bindingWord.php');
include_once('GetSDKImagesFromPDFTemplate.php');
include_once('GetSDKImagesFromPDFTemplateResponse.php');
include_once('ModifyContainer.php');
include_once('abxVersioningList.php');
include_once('abxVersioning.php');
include_once('ModifyContainerResponse.php');
include_once('abxContainerResult.php');
include_once('Fk_DB_testConnection.php');
include_once('Fk_DB_testConnectionResponse.php');
include_once('GetListMarker.php');
include_once('GetListMarkerResponse.php');
include_once('GetDataFileContainerDetail.php');
include_once('GetDataFileContainerDetailResponse.php');
include_once('GetSDKTextFromTemplate.php');
include_once('GetSDKTextFromTemplateResponse.php');
include_once('GetDataFileListWA.php');
include_once('GetDataFileListWAResponse.php');
include_once('ModifyTemplate.php');
include_once('ModifyTemplateResponse.php');
include_once('abxTemplateResult.php');
include_once('CanInsertFileContainer.php');
include_once('CanInsertFileContainerResponse.php');
include_once('ModifyLinkContainerToContainer.php');
include_once('ModifyLinkContainerToContainerResponse.php');
include_once('abxLinkResult.php');
include_once('abxLinkList.php');
include_once('abxLink.php');
include_once('CreateDynorg.php');
include_once('CreateDynorgResponse.php');
include_once('GetInstancePathname.php');
include_once('GetInstancePathnameResponse.php');
include_once('abxGipResult.php');
include_once('ValidateSDKTask.php');
include_once('ValidateSDKTaskResponse.php');
include_once('Login.php');
include_once('abxLoginIdentity.php');
include_once('LoginResponse.php');
include_once('abxLoginResult.php');
include_once('abxLoginInfo.php');
include_once('GetFieldList.php');
include_once('GetFieldListResponse.php');
include_once('abxFieldResult.php');
include_once('DownloadUSGetNext.php');
include_once('DownloadUSGetNextResponse.php');
include_once('canCreateField.php');
include_once('canCreateFieldResponse.php');
include_once('ModifyFileDescription.php');
include_once('ModifyFileDescriptionResponse.php');
include_once('InsertData.php');
include_once('abxDataList.php');
include_once('abxData.php');
include_once('data.php');
include_once('detailData.php');
include_once('InsertDataResponse.php');
include_once('abxDataResult.php');
include_once('UploadWFSendChunk.php');
include_once('UploadWFSendChunkResponse.php');
include_once('GetDataLimit.php');
include_once('GetDataLimitResponse.php');
include_once('GetDataTPFileListByName.php');
include_once('GetDataTPFileListByNameResponse.php');
include_once('DownloadGetNextWA.php');
include_once('DownloadGetNextWAResponse.php');
include_once('DownloadUSFile.php');
include_once('DownloadUSFileResponse.php');
include_once('SetTmpTPUploadPath.php');
include_once('SetTmpTPUploadPathResponse.php');
include_once('GetGroupsListByUser.php');
include_once('GetGroupsListByUserResponse.php');
include_once('DownloadWFEndFile.php');
include_once('DownloadWFEndFileResponse.php');
include_once('canDeleteTemplate.php');
include_once('canDeleteTemplateResponse.php');
include_once('DeleteSDKLog.php');
include_once('DeleteSDKLogResponse.php');
include_once('CopyData.php');
include_once('CopyDataResponse.php');
include_once('CreateSDKTaskWatchFolder.php');
include_once('CreateSDKTaskWatchFolderResponse.php');
include_once('GetArchiBoxInfo.php');
include_once('GetArchiBoxInfoResponse.php');
include_once('abxArchiBoxDomainResult.php');
include_once('abxArchiBoxDomainList.php');
include_once('abxArchiBoxDomain.php');
include_once('Fk_getCountAllRecordByIndexDesc.php');
include_once('Fk_getCountAllRecordByIndexDescResponse.php');
include_once('GetSDKTaskFieldMapping.php');
include_once('GetSDKTaskFieldMappingResponse.php');
include_once('DeleteTPFileByCode.php');
include_once('DeleteTPFileByCodeResponse.php');
include_once('MoveData.php');
include_once('MoveDataResponse.php');
include_once('ModifyUser.php');
include_once('ModifyUserResponse.php');
include_once('GetSchedulerTasks.php');
include_once('GetSchedulerTasksResponse.php');
include_once('abxSchedulerResult.php');
include_once('abxSchedulerTaskList.php');
include_once('abxSchedulerTask.php');
include_once('abxSchedule.php');
include_once('ModifyField.php');
include_once('abxCombo.php');
include_once('abxComboRecord.php');
include_once('ModifyFieldResponse.php');
include_once('ExistUserByUsername.php');
include_once('ExistUserByUsernameResponse.php');
include_once('GetDownloadDetailByContId.php');
include_once('GetDownloadDetailByContIdResponse.php');
include_once('CreateSDKTaskFieldMapping.php');
include_once('CreateSDKTaskFieldMappingResponse.php');
include_once('GetUserListActiveDirectory.php');
include_once('GetUserListActiveDirectoryResponse.php');
include_once('RegenerateDynOrg.php');
include_once('RegenerateDynOrgResponse.php');
include_once('GetSchedulerTaskByTaskTypeId.php');
include_once('GetSchedulerTaskByTaskTypeIdResponse.php');
include_once('DownloadUSGetChunk.php');
include_once('DownloadUSGetChunkResponse.php');
include_once('GetProtocolByNameDesc.php');
include_once('GetProtocolByNameDescResponse.php');
include_once('GetDynorgTypeList.php');
include_once('GetDynorgTypeListResponse.php');
include_once('canDeleteRaccoglitore.php');
include_once('canDeleteRaccoglitoreResponse.php');
include_once('GetTemplateList.php');
include_once('GetTemplateListResponse.php');
include_once('UploadUSSendChunk.php');
include_once('UploadUSSendChunkResponse.php');
include_once('GetInstanceNameFromLinks.php');
include_once('GetInstanceNameFromLinksResponse.php');
include_once('GetTreeForSecurity.php');
include_once('abxTreeParam.php');
include_once('objvect.php');
include_once('GetTreeForSecurityResponse.php');
include_once('abxTreeResult.php');
include_once('abxTree.php');
include_once('abxTreeElement.php');
include_once('Logout.php');
include_once('LogoutResponse.php');
include_once('DeleteGroup.php');
include_once('DeleteGroupResponse.php');
include_once('abxGroupResult.php');
include_once('GetFileListByCodeForSecurity.php');
include_once('GetFileListByCodeForSecurityResponse.php');
include_once('SetFileAvailable.php');
include_once('SetFileAvailableResponse.php');
include_once('Fk_getCountAllRecord.php');
include_once('Fk_getCountAllRecordResponse.php');
include_once('GetExpression.php');
include_once('GetExpressionResponse.php');
include_once('DeleteField.php');
include_once('DeleteFieldResponse.php');
include_once('GetSDKTasks.php');
include_once('GetSDKTasksResponse.php');
include_once('GetContSignByUser.php');
include_once('GetContSignByUserResponse.php');
include_once('Fk_create.php');
include_once('Fk_createResponse.php');
include_once('Fk_getColumnsName.php');
include_once('Fk_getColumnsNameResponse.php');
include_once('InsertFileContainer.php');
include_once('InsertFileContainerResponse.php');
include_once('GetContainerLinks.php');
include_once('GetContainerLinksResponse.php');
include_once('DeleteTPFileById.php');
include_once('DeleteTPFileByIdResponse.php');
include_once('canDeleteContainer.php');
include_once('canDeleteContainerResponse.php');
include_once('IfFileExist.php');
include_once('IfFileExistResponse.php');
include_once('DownloadTPFile.php');
include_once('DownloadTPFileResponse.php');
include_once('SetInstanceReplication.php');
include_once('abxReplicationList.php');
include_once('abxArchiBoxInDomain.php');
include_once('SetInstanceReplicationResponse.php');
include_once('abxReplicationResult.php');
include_once('Fk_getRemoteTableList.php');
include_once('Fk_getRemoteTableListResponse.php');
include_once('GetDataFileListOnlyLastVersion.php');
include_once('GetDataFileListOnlyLastVersionResponse.php');
include_once('DelMarker.php');
include_once('DelMarkerResponse.php');
include_once('ModDefaultProcess.php');
include_once('ModDefaultProcessResponse.php');
include_once('canModifyTemplate.php');
include_once('canModifyTemplateResponse.php');
include_once('GetSDKRules.php');
include_once('GetSDKRulesResponse.php');
include_once('GetTranslationByRangeLabelCode.php');
include_once('GetTranslationByRangeLabelCodeResponse.php');
include_once('abxTranslationResult.php');
include_once('abxTranslationList.php');
include_once('GetCountDocumentLinks.php');
include_once('GetCountDocumentLinksResponse.php');
include_once('DeleteFileContainer.php');
include_once('DeleteFileContainerResponse.php');
include_once('Ping.php');
include_once('PingResponse.php');
include_once('AbxPingResult.php');
include_once('GetUploadDetailByFilecode.php');
include_once('GetUploadDetailByFilecodeResponse.php');
include_once('CanAddNewYear.php');
include_once('CanAddNewYearResponse.php');
include_once('InsertUser.php');
include_once('InsertUserResponse.php');
include_once('GetDataUSFileListByUsername.php');
include_once('GetDataUSFileListByUsernameResponse.php');
include_once('canModifyField.php');
include_once('canModifyFieldResponse.php');
include_once('ModifyFilter.php');
include_once('AbxFilter.php');
include_once('ModifyFilterResponse.php');
include_once('AbxFilterResult.php');
include_once('AbxFilterList.php');
include_once('InsertGroup.php');
include_once('InsertGroupResponse.php');
include_once('GetProtocolById.php');
include_once('GetProtocolByIdResponse.php');
include_once('GetData.php');
include_once('GetDataResponse.php');
include_once('canDeleteField.php');
include_once('canDeleteFieldResponse.php');
include_once('AddDefaultProcess.php');
include_once('AddDefaultProcessResponse.php');
include_once('ValidateSession.php');
include_once('ValidateSessionResponse.php');
include_once('Fk_getCountAllRecordByDesc.php');
include_once('Fk_getCountAllRecordByDescResponse.php');
include_once('SchedulerTaskScheduleProcessed.php');
include_once('schedule.php');
include_once('SchedulerTaskScheduleProcessedResponse.php');
include_once('DownloadWFFile.php');
include_once('DownloadWFFileResponse.php');
include_once('EditProtocol.php');
include_once('EditProtocolResponse.php');
include_once('GetDataTPFileDetail.php');
include_once('GetDataTPFileDetailResponse.php');
include_once('GetDataCountWithoutPermission.php');
include_once('GetDataCountWithoutPermissionResponse.php');
include_once('InsertLinkContainerToContainer.php');
include_once('InsertLinkContainerToContainerResponse.php');
include_once('GetSign.php');
include_once('GetSignResponse.php');
include_once('UploadUSEndFile.php');
include_once('UploadUSEndFileResponse.php');
include_once('DelDefaultProcess.php');
include_once('DelDefaultProcessResponse.php');
include_once('GetDataCountWithPermission.php');
include_once('GetDataCountWithPermissionResponse.php');
include_once('GetExpressionValue.php');
include_once('GetExpressionValueResponse.php');
include_once('GetLanguages.php');
include_once('GetLanguagesResponse.php');
include_once('abxLanguageResult.php');
include_once('abxLanguageList.php');
include_once('abxLanguage.php');
include_once('CanDeleteLinkFromContainer.php');
include_once('CanDeleteLinkFromContainerResponse.php');
include_once('TestScritturaLettura.php');
include_once('TestScritturaLetturaResponse.php');
include_once('DeleteTemplate.php');
include_once('DeleteTemplateResponse.php');
include_once('DeleteRaccoglitore.php');
include_once('DeleteRaccoglitoreResponse.php');
include_once('DeleteFile.php');
include_once('DeleteFileResponse.php');
include_once('ModUserSettings.php');
include_once('ModUserSettingsResponse.php');
include_once('InsertLinkContainerToDocument.php');
include_once('InsertLinkContainerToDocumentResponse.php');
include_once('CopyFile.php');
include_once('CopyFileResponse.php');
include_once('GetTree.php');
include_once('GetTreeResponse.php');
include_once('CanInsertLinkDocumentToDocument.php');
include_once('CanInsertLinkDocumentToDocumentResponse.php');
include_once('GetDataUSFileDetail.php');
include_once('GetDataUSFileDetailResponse.php');
include_once('ModUser.php');
include_once('ModUserResponse.php');
include_once('DeleteSchedulerTaskSchedule.php');
include_once('DeleteSchedulerTaskScheduleResponse.php');
include_once('AddMarker.php');
include_once('AddMarkerResponse.php');
include_once('GetDocumentLinks.php');
include_once('GetDocumentLinksResponse.php');
include_once('GetInstanceReplicationStatus.php');
include_once('GetInstanceReplicationStatusResponse.php');
include_once('Fk_getPars.php');
include_once('Fk_getParsResponse.php');
include_once('CheckOut_attachContainer.php');
include_once('CheckOut_attachContainerResponse.php');
include_once('abxCheckinResult.php');
include_once('abxCheckinList.php');
include_once('abxCheckin.php');
include_once('GetTranslationByMessageId.php');
include_once('GetTranslationByMessageIdResponse.php');
include_once('GetSDKTaskExcelPreview.php');
include_once('GetSDKTaskExcelPreviewResponse.php');
include_once('CheckIn_attach.php');
include_once('CheckIn_attachResponse.php');
include_once('SetTmpWFUploadPath.php');
include_once('SetTmpWFUploadPathResponse.php');
include_once('ModifyData.php');
include_once('ModifyDataResponse.php');
include_once('GetDownloadDetailByCont.php');
include_once('GetDownloadDetailByContResponse.php');
include_once('Fk_getParsAllFk.php');
include_once('Fk_getParsAllFkResponse.php');
include_once('GetLinksToDocument.php');
include_once('GetLinksToDocumentResponse.php');
include_once('UploadEndFileContainer.php');
include_once('UploadEndFileContainerResponse.php');
include_once('GetDownloadDetailByDataId.php');
include_once('GetDownloadDetailByDataIdResponse.php');
include_once('GetDataWAById.php');
include_once('GetDataWAByIdResponse.php');
include_once('GetArchiBoxInDomain.php');
include_once('GetArchiBoxInDomainResponse.php');
include_once('Fk_WS_insert.php');
include_once('Fk_WS_insertResponse.php');
include_once('CanDeleteData.php');
include_once('CanDeleteDataResponse.php');
include_once('Fk_getRemoteViewList.php');
include_once('Fk_getRemoteViewListResponse.php');
include_once('GetDataByIdForSecurity.php');
include_once('GetDataByIdForSecurityResponse.php');
include_once('ModifyUserConfig.php');
include_once('ModifyUserConfigResponse.php');
include_once('VerifyExpression.php');
include_once('VerifyExpressionResponse.php');
include_once('DeleteProtocol.php');
include_once('DeleteProtocolResponse.php');
include_once('DelSign.php');
include_once('DelSignResponse.php');
include_once('DeleteFilter.php');
include_once('DeleteFilterResponse.php');
include_once('CreateRaccoglitore.php');
include_once('CreateRaccoglitoreResponse.php');
include_once('CanInsertLinkContainerToContainer.php');
include_once('CanInsertLinkContainerToContainerResponse.php');
include_once('UploadEndFileWA.php');
include_once('UploadEndFileWAResponse.php');
include_once('canCreateRaccoglitore.php');
include_once('canCreateRaccoglitoreResponse.php');
include_once('CanModifyLinkContainerToContainer.php');
include_once('CanModifyLinkContainerToContainerResponse.php');
include_once('GetSDKWatchFolderDirectories.php');
include_once('GetSDKWatchFolderDirectoriesResponse.php');
include_once('GetQueryParam.php');
include_once('GetQueryParamResponse.php');
include_once('abxRetOption4QueryResult.php');
include_once('abxQFieldList.php');
include_once('abxQobjectList.php');
include_once('abxQobject.php');
include_once('abxQtemplateList.php');
include_once('abxQtemplate.php');
include_once('GetArchSostRules.php');
include_once('GetArchSostRulesResponse.php');
include_once('abxArchSostResult.php');
include_once('abxArchSostRuleList.php');
include_once('abxArchSostRule.php');
include_once('abxArchSostRuleFilters.php');
include_once('abxArchSostRuleMap.php');
include_once('GetSDKVariables.php');
include_once('GetSDKVariablesResponse.php');
include_once('DownloadFileWAByFileUniqueCode.php');
include_once('DownloadFileWAByFileUniqueCodeResponse.php');
include_once('DownloadEndFileWA.php');
include_once('DownloadEndFileWAResponse.php');
include_once('DeleteClasseDocumentale.php');
include_once('DeleteClasseDocumentaleResponse.php');
include_once('abxClasseDocumentaleResult.php');
include_once('abxClasseDocumentaleList.php');
include_once('abxClasseDocumentale.php');
include_once('Metadata.php');
include_once('CanDeleteFile.php');
include_once('CanDeleteFileResponse.php');
include_once('EndPermissionSettings.php');
include_once('EndPermissionSettingsResponse.php');
include_once('abxPermissionResult.php');
include_once('abxPermissionElenco.php');
include_once('InsertUserInGroup.php');
include_once('InsertUserInGroupResponse.php');
include_once('canCreateContainer.php');
include_once('canCreateContainerResponse.php');
include_once('GetDownloadDetailByFilecode.php');
include_once('GetDownloadDetailByFilecodeResponse.php');
include_once('GetAllFilter.php');
include_once('GetAllFilterResponse.php');
include_once('Fk_getAllRecordByIndex.php');
include_once('Fk_getAllRecordByIndexResponse.php');
include_once('InsertClasseDocumentale.php');
include_once('InsertClasseDocumentaleResponse.php');
include_once('CheckOut_document.php');
include_once('CheckOut_documentResponse.php');
include_once('DownloadGetNext.php');
include_once('DownloadGetNextResponse.php');
include_once('SetTmpUSDownloadPath.php');
include_once('SetTmpUSDownloadPathResponse.php');
include_once('canCreateTemplate.php');
include_once('canCreateTemplateResponse.php');
include_once('CanDeleteFileContainer.php');
include_once('CanDeleteFileContainerResponse.php');
include_once('QueryHeader.php');
include_once('QueryHeaderResponse.php');
include_once('GetProtocolList.php');
include_once('GetProtocolListResponse.php');
include_once('GetFieldsPropertiesFromTemplate.php');
include_once('GetFieldsPropertiesFromTemplateResponse.php');
include_once('CheckOut_attach.php');
include_once('CheckOut_attachResponse.php');
include_once('DeleteDataWA.php');
include_once('DeleteDataWAResponse.php');
include_once('DeleteArchSostRule.php');
include_once('DeleteArchSostRuleResponse.php');
include_once('GetMethod.php');
include_once('GetMethodResponse.php');
include_once('abxGmResult.php');
include_once('abxMethodDef.php');
include_once('elmethod.php');
include_once('CanAddNewDate.php');
include_once('CanAddNewDateResponse.php');
include_once('ModifySDKTask.php');
include_once('ModifySDKTaskResponse.php');
include_once('GetArchiBoxInDomainByMatricola.php');
include_once('GetArchiBoxInDomainByMatricolaResponse.php');
include_once('InsertTranslationCode.php');
include_once('InsertTranslationCodeResponse.php');
include_once('GetGroupList.php');
include_once('GetGroupListResponse.php');
include_once('Fk_getAllRecordByIndexDesc.php');
include_once('Fk_getAllRecordByIndexDescResponse.php');
include_once('CanModifyData.php');
include_once('CanModifyDataResponse.php');
include_once('CanAddDigitalSignature.php');
include_once('CanAddDigitalSignatureResponse.php');
include_once('Query.php');
include_once('QueryResponse.php');
include_once('GetInstanceId.php');
include_once('GetInstanceIdResponse.php');
include_once('abxGiiResult.php');
include_once('InsertArchSostRule.php');
include_once('InsertArchSostRuleResponse.php');
include_once('Combo_insert.php');
include_once('Combo_insertResponse.php');
include_once('abxComboResult.php');
include_once('abxComboList.php');
include_once('ExtractSDKPDFTemplateTextByArea.php');
include_once('ExtractSDKPDFTemplateTextByAreaResponse.php');
include_once('GetDefaultObjActList.php');
include_once('GetDefaultObjActListResponse.php');
include_once('GetAdjacentArchiBox.php');
include_once('GetAdjacentArchiBoxResponse.php');
include_once('DeleteSDKTask.php');
include_once('DeleteSDKTaskResponse.php');
include_once('DownloadTPEndFile.php');
include_once('DownloadTPEndFileResponse.php');
include_once('GetUploadDetailByContId.php');
include_once('GetUploadDetailByContIdResponse.php');
include_once('GetLinksToDocumentFiltered.php');
include_once('GetLinksToDocumentFilteredResponse.php');
include_once('Fk_getRemoteDatabaseList.php');
include_once('Fk_getRemoteDatabaseListResponse.php');
include_once('GetDataFileListForSecurity.php');
include_once('GetDataFileListForSecurityResponse.php');
include_once('GetUploadDetailByData.php');
include_once('GetUploadDetailByDataResponse.php');
include_once('DownloadGetChunkWA.php');
include_once('DownloadGetChunkWAResponse.php');
include_once('GetWsdlVersion.php');
include_once('GetWsdlVersionResponse.php');
include_once('AbxWsdlResult.php');
include_once('InsertUSFile.php');
include_once('InsertUSFileResponse.php');
include_once('InsertProtocol.php');
include_once('InsertProtocolResponse.php');
include_once('DownloadFilePreview.php');
include_once('DownloadFilePreviewResponse.php');
include_once('AddFileToSyncByArcCue.php');
include_once('AddFileToSyncByArcCueResponse.php');
include_once('AddLogSDK.php');
include_once('AddLogSDKResponse.php');
include_once('DigitalSign.php');
include_once('DigitalSignResponse.php');
include_once('GetUploadDetailByCont.php');
include_once('GetUploadDetailByContResponse.php');
include_once('GetFieldProperties.php');
include_once('GetFieldPropertiesResponse.php');
include_once('DelExpression.php');
include_once('DelExpressionResponse.php');
include_once('SetTmpUploadPath.php');
include_once('SetTmpUploadPathResponse.php');
include_once('CanEditProtocol.php');
include_once('CanEditProtocolResponse.php');
include_once('GetUserList.php');
include_once('GetUserListResponse.php');
include_once('DeleteUSFileByCode.php');
include_once('DeleteUSFileByCodeResponse.php');
include_once('UploadTPSendChunk.php');
include_once('UploadTPSendChunkResponse.php');
include_once('DownloadFileContainer.php');
include_once('DownloadFileContainerResponse.php');
include_once('SetTmpTPDownloadPath.php');
include_once('SetTmpTPDownloadPathResponse.php');
include_once('DeleteUSFileById.php');
include_once('DeleteUSFileByIdResponse.php');
include_once('DeleteTranslationByCode.php');
include_once('DeleteTranslationByCodeResponse.php');
include_once('InsertFilter.php');
include_once('InsertFilterResponse.php');
include_once('GetDataFileList.php');
include_once('GetDataFileListResponse.php');
include_once('GetDataTPFileList.php');
include_once('GetDataTPFileListResponse.php');
include_once('GetRootId.php');
include_once('GetRootIdResponse.php');
include_once('GetTranslationByLabelCode.php');
include_once('GetTranslationByLabelCodeResponse.php');
include_once('GetSchedulerTasksToRun.php');
include_once('GetSchedulerTasksToRunResponse.php');
include_once('DownloadFileByFileUniqueCode.php');
include_once('DownloadFileByFileUniqueCodeResponse.php');
include_once('ModifyRaccoglitore.php');
include_once('ModifyRaccoglitoreResponse.php');
include_once('SetTmpUSUploadPath.php');
include_once('SetTmpUSUploadPathResponse.php');
include_once('Fk_DB_modify.php');
include_once('Fk_DB_modifyResponse.php');
include_once('UploadWFEndFile.php');
include_once('UploadWFEndFileResponse.php');
include_once('GetDataFileListContainer.php');
include_once('GetDataFileListContainerResponse.php');
include_once('ModSign.php');
include_once('ModSignResponse.php');
include_once('Combo_getAll.php');
include_once('Combo_getAllResponse.php');
include_once('DownloadGetChunk.php');
include_once('DownloadGetChunkResponse.php');
include_once('ModifyGroup.php');
include_once('ModifyGroupResponse.php');
include_once('InsertUserConfig.php');
include_once('InsertUserConfigResponse.php');
include_once('GetProtocolByName.php');
include_once('GetProtocolByNameResponse.php');
include_once('canModifyContainer.php');
include_once('canModifyContainerResponse.php');
include_once('InsertTranslationDecimalCode.php');
include_once('InsertTranslationDecimalCodeResponse.php');
include_once('GetTranslationBySourceSuffix.php');
include_once('GetTranslationBySourceSuffixResponse.php');
include_once('GetDynorgList.php');
include_once('GetDynorgListResponse.php');
include_once('Fk_DB_delete.php');
include_once('Fk_DB_deleteResponse.php');
include_once('UploadTPEndFile.php');
include_once('UploadTPEndFileResponse.php');
include_once('AddUserSettings.php');
include_once('AddUserSettingsResponse.php');
include_once('GetUploadDetailByDataId.php');
include_once('GetUploadDetailByDataIdResponse.php');
include_once('Combo_removeItem.php');
include_once('Combo_removeItemResponse.php');
include_once('ModifyDynorg.php');
include_once('ModifyDynorgResponse.php');
include_once('GetDataById.php');
include_once('GetDataByIdResponse.php');
include_once('DeleteWFFileByCode.php');
include_once('DeleteWFFileByCodeResponse.php');
include_once('GetListDataWA.php');
include_once('GetListDataWAResponse.php');
include_once('GetContSign.php');
include_once('GetContSignResponse.php');
include_once('GetDomainList.php');
include_once('GetDomainListResponse.php');
include_once('abxDomainResult.php');
include_once('abxDomainList.php');
include_once('abxDomain.php');
include_once('UploadSendChunkWA.php');
include_once('UploadSendChunkWAResponse.php');
include_once('GetNewProtocolNumber.php');
include_once('GetNewProtocolNumberResponse.php');
include_once('abxProtocolUseResult.php');
include_once('abxProtocolUseList.php');
include_once('InsertLinkDocumentToDocument.php');
include_once('InsertLinkDocumentToDocumentResponse.php');
include_once('Fk_getAllRecordByDesc.php');
include_once('Fk_getAllRecordByDescResponse.php');
include_once('CanUseProtocol.php');
include_once('CanUseProtocolResponse.php');
include_once('CreateContainer.php');
include_once('CreateContainerResponse.php');
include_once('ChangeSchedulerTaskScheduleStatus.php');
include_once('ChangeSchedulerTaskScheduleStatusResponse.php');
include_once('Fk_getLocalFieldList.php');
include_once('Fk_getLocalFieldListResponse.php');
include_once('DeleteTranslation.php');
include_once('DeleteTranslationResponse.php');
include_once('Combo_removeAll.php');
include_once('Combo_removeAllResponse.php');
include_once('canModifyDynorg.php');
include_once('canModifyDynorgResponse.php');
include_once('ModifyUserPassword.php');
include_once('ModifyUserPasswordResponse.php');
include_once('GetDataUSFileList.php');
include_once('GetDataUSFileListResponse.php');
include_once('Combo_isCombo.php');
include_once('Combo_isComboResponse.php');
include_once('CanModifyLinkContainerToDocument.php');
include_once('CanModifyLinkContainerToDocumentResponse.php');
include_once('ModifyTranslation.php');
include_once('ModifyTranslationResponse.php');
include_once('DeleteSchedulerTask.php');
include_once('DeleteSchedulerTaskResponse.php');
include_once('GetFileAvailable.php');
include_once('GetFileAvailableResponse.php');
include_once('CanShowFile.php');
include_once('CanShowFileResponse.php');
include_once('DeleteDynorg.php');
include_once('DeleteDynorgResponse.php');
include_once('DeleteUserByUsername.php');
include_once('DeleteUserByUsernameResponse.php');
include_once('TestLettura.php');
include_once('TestLetturaResponse.php');
include_once('FullTreePathName.php');
include_once('FullTreePathNameResponse.php');
include_once('UploadEndFile.php');
include_once('UploadEndFileResponse.php');
include_once('ModifyLinkContainerToDocument.php');
include_once('ModifyLinkContainerToDocumentResponse.php');
include_once('GetUserDetailByUserId.php');
include_once('GetUserDetailByUserIdResponse.php');
include_once('CreateSDKTask.php');
include_once('CreateSDKTaskResponse.php');
include_once('GetDataWFFileList.php');
include_once('GetDataWFFileListResponse.php');
include_once('GetUsersListByGroup.php');
include_once('GetUsersListByGroupResponse.php');
include_once('ModifyDataWA.php');
include_once('ModifyDataWAResponse.php');
include_once('InsertFileWA.php');
include_once('InsertFileWAResponse.php');
include_once('ChangeSDKTaskStatus.php');
include_once('ChangeSDKTaskStatusResponse.php');
include_once('GetDataFileDetail.php');
include_once('GetDataFileDetailResponse.php');
include_once('CanInsertFile.php');
include_once('CanInsertFileResponse.php');
include_once('GetDefaultProcess.php');
include_once('GetDefaultProcessResponse.php');
include_once('GetClasseDocumentale.php');
include_once('GetClasseDocumentaleResponse.php');
include_once('UploadPreviewFile.php');
include_once('UploadPreviewFileResponse.php');
include_once('InsertTPFile.php');
include_once('InsertTPFileResponse.php');
include_once('Combo_modify.php');
include_once('Combo_modifyResponse.php');
include_once('GetWorkflowVariables.php');
include_once('GetWorkflowVariablesResponse.php');
include_once('DeleteWFFileById.php');
include_once('DeleteWFFileByIdResponse.php');
include_once('CanInsertData.php');
include_once('CanInsertDataResponse.php');
include_once('VerifySDKTaskNameExists.php');
include_once('VerifySDKTaskNameExistsResponse.php');
include_once('ModifySchedulerTaskSchedule.php');
include_once('ModifySchedulerTaskScheduleResponse.php');
include_once('ModifyArchSostRule.php');
include_once('ModifyArchSostRuleResponse.php');
include_once('InsertDataWA.php');
include_once('InsertDataWAResponse.php');
include_once('CanInsertProtocol.php');
include_once('CanInsertProtocolResponse.php');
include_once('UploadUSEndFileWithUser.php');
include_once('UploadUSEndFileWithUserResponse.php');
include_once('ModExpression.php');
include_once('ModExpressionResponse.php');
include_once('InsertWFFile.php');
include_once('InsertWFFileResponse.php');
include_once('ResetUserSessions.php');
include_once('ResetUserSessionsResponse.php');
include_once('CanInsertLinkContainerToDocument.php');
include_once('CanInsertLinkContainerToDocumentResponse.php');
include_once('SetTmpDownloadPath.php');
include_once('SetTmpDownloadPathResponse.php');
include_once('GetSDKTaskWatchFolder.php');
include_once('GetSDKTaskWatchFolderResponse.php');
include_once('GetDownloadDetailByData.php');
include_once('GetDownloadDetailByDataResponse.php');
include_once('ModifySDKTaskWatchFolder.php');
include_once('ModifySDKTaskWatchFolderResponse.php');
include_once('GetProtocolByDesc.php');
include_once('GetProtocolByDescResponse.php');
include_once('DeleteLink.php');
include_once('DeleteLinkResponse.php');
include_once('InsertTranslation.php');
include_once('InsertTranslationResponse.php');
include_once('UploadSendChunk.php');
include_once('UploadSendChunkResponse.php');
include_once('GetCountLinksToDocument.php');
include_once('GetCountLinksToDocumentResponse.php');
include_once('CreateTemplate.php');
include_once('CreateTemplateResponse.php');
include_once('DestroyContainer.php');
include_once('DestroyContainerResponse.php');
include_once('RemoveUserByGroup.php');
include_once('RemoveUserByGroupResponse.php');
include_once('GetCountFileList.php');
include_once('GetCountFileListResponse.php');
include_once('GetDataTPFileListByDocument.php');
include_once('GetDataTPFileListByDocumentResponse.php');
include_once('DownloadFile.php');
include_once('DownloadFileResponse.php');
include_once('DownloadFileContainerUnc.php');
include_once('DownloadFileContainerUncResponse.php');
include_once('CanDeleteProtocol.php');
include_once('CanDeleteProtocolResponse.php');
include_once('canCreateDynorg.php');
include_once('canCreateDynorgResponse.php');
include_once('InsertSchedulerTask.php');
include_once('abxArchSostDocumentList.php');
include_once('abxArchSostDocument.php');
include_once('InsertSchedulerTaskResponse.php');
include_once('CreateField.php');
include_once('CreateFieldResponse.php');
include_once('DownloadFileWA.php');
include_once('DownloadFileWAResponse.php');
include_once('GetDataTPFileListByUsername.php');
include_once('GetDataTPFileListByUsernameResponse.php');
include_once('DownloadFileUnc.php');
include_once('DownloadFileUncResponse.php');
include_once('SaveChars.php');
include_once('SaveCharsResponse.php');
include_once('GetUserSettings.php');
include_once('GetUserSettingsResponse.php');
include_once('StartSDKTask.php');
include_once('Fk_getAllRecord.php');
include_once('Fk_getAllRecordResponse.php');
include_once('DeleteContainer.php');
include_once('DeleteContainerResponse.php');
include_once('DeleteFileVersion.php');
include_once('DeleteFileVersionResponse.php');
include_once('CanModifyFile.php');
include_once('CanModifyFileResponse.php');
include_once('DelUserSettings.php');
include_once('DelUserSettingsResponse.php');
include_once('CheckIn_document.php');
include_once('CheckIn_documentResponse.php');
include_once('SetTmpWFDownloadPath.php');
include_once('SetTmpWFDownloadPathResponse.php');
include_once('ShowProtocol.php');
include_once('ShowProtocolResponse.php');
include_once('DeleteData.php');
include_once('DeleteDataResponse.php');
include_once('StoreSDKVariable.php');
include_once('StoreSDKVariableResponse.php');
include_once('GetObject.php');
include_once('GetObjectResponse.php');
include_once('abxGoResult.php');
include_once('abxObjDef.php');
include_once('elobj.php');
include_once('methods.php');
include_once('AddUser.php');
include_once('AddUserResponse.php');
include_once('CheckIn_attachContainer.php');
include_once('CheckIn_attachContainerResponse.php');
include_once('GetTemplateProperties.php');
include_once('GetTemplatePropertiesResponse.php');
include_once('GetDataWFFileDetail.php');
include_once('GetDataWFFileDetailResponse.php');
include_once('GetAllObjectWithSystem.php');
include_once('GetAllObjectWithSystemResponse.php');
include_once('GetInstanceReplication.php');
include_once('GetInstanceReplicationResponse.php');
include_once('DeleteFileWA.php');
include_once('DeleteFileWAResponse.php');
include_once('DeleteFileContainerVersion.php');
include_once('DeleteFileContainerVersionResponse.php');
include_once('InsertFile.php');
include_once('InsertFileResponse.php');
include_once('abxDynamicorgRuleList.php');
include_once('abxDynamicorgRule.php');
include_once('abxDynamicorgRuleElement.php');
include_once('abxDynamicRuleResult.php');
include_once('abxDynorgTypeResult.php');
include_once('abxDynamicorgTypeList.php');
include_once('abxDynorgRuleType.php');


/**
 * 
 */
class abxWsGestService extends SoapClient
{

  /**
   * 
   * @var array $classmap The defined classes
   * @access private
   */
  private static $classmap = array(
    'abxProtocolResult' => 'abxProtocolResult',
    'abxProtocolList' => 'abxProtocolList',
    'abxProtocol' => 'abxProtocol',
    'allDescription' => 'allDescription',
    'abxCan' => 'abxCan',
    'DeleteSDKTaskFieldMapping' => 'DeleteSDKTaskFieldMapping',
    'IDtype' => 'IDtype',
    'DeleteSDKTaskFieldMappingResponse' => 'DeleteSDKTaskFieldMappingResponse',
    'abxSDKResult' => 'abxSDKResult',
    'abxSDKTaskList' => 'abxSDKTaskList',
    'abxSDKTask' => 'abxSDKTask',
    'abxSDKWatchFolder' => 'abxSDKWatchFolder',
    'abxSDKTaskFieldMapping' => 'abxSDKTaskFieldMapping',
    'abxSDKTaskFieldMappingRule' => 'abxSDKTaskFieldMappingRule',
    'abxSDKTaskExcelPreviewSheet' => 'abxSDKTaskExcelPreviewSheet',
    'abxSDKTaskExcelPreviewColumn' => 'abxSDKTaskExcelPreviewColumn',
    'abxSDKTaskExcelPreviewRow' => 'abxSDKTaskExcelPreviewRow',
    'abxSDKTaskPDFPreview' => 'abxSDKTaskPDFPreview',
    'abxSDKTaskPDFImage' => 'abxSDKTaskPDFImage',
    'abxSDKTaskValidateData' => 'abxSDKTaskValidateData',
    'abxSDKTaskValidateField' => 'abxSDKTaskValidateField',
    'abxSDKRuleList' => 'abxSDKRuleList',
    'abxSDKRule' => 'abxSDKRule',
    'abxSDKVariableList' => 'abxSDKVariableList',
    'abxSDKVariable' => 'abxSDKVariable',
    'abxSDKWatchFolderDirectoryList' => 'abxSDKWatchFolderDirectoryList',
    'abxSDKWatchFolderDirectory' => 'abxSDKWatchFolderDirectory',
    'RemoveUserByAllGroups' => 'RemoveUserByAllGroups',
    'RemoveUserByAllGroupsResponse' => 'RemoveUserByAllGroupsResponse',
    'abxUserListResult' => 'abxUserListResult',
    'abxUserList' => 'abxUserList',
    'abxUser' => 'abxUser',
    'abxUserConfig' => 'abxUserConfig',
    'abxGroupList' => 'abxGroupList',
    'abxGroup' => 'abxGroup',
    'AddExpression' => 'AddExpression',
    'abxExpression' => 'abxExpression',
    'returnWrongKeys' => 'returnWrongKeys',
    'abxTranslation' => 'abxTranslation',
    'allDescription' => 'allDescription',
    'AddExpressionResponse' => 'AddExpressionResponse',
    'abxExpressionResult' => 'abxExpressionResult',
    'abxExpressionList' => 'abxExpressionList',
    'AddSign' => 'AddSign',
    'abxWorkflow' => 'abxWorkflow',
    'processoDefUsers' => 'processoDefUsers',
    'signList' => 'signList',
    'userSettings' => 'userSettings',
    'variables' => 'variables',
    'AddSignResponse' => 'AddSignResponse',
    'abxWorkflowResult' => 'abxWorkflowResult',
    'abxWorkflowList' => 'abxWorkflowList',
    'GetUserDetailByUsername' => 'GetUserDetailByUsername',
    'GetUserDetailByUsernameResponse' => 'GetUserDetailByUsernameResponse',
    'QueryTotAttach' => 'QueryTotAttach',
    'abxQexpression' => 'abxQexpression',
    'abxQnode' => 'abxQnode',
    'abxQField' => 'abxQField',
    'abxField' => 'abxField',
    'allDescription' => 'allDescription',
    'allOptionDescription' => 'allOptionDescription',
    'extended' => 'extended',
    'abxPermission' => 'abxPermission',
    'list' => 'listCustom',
    'editPermission' => 'editPermission',
    'abxObjAction' => 'abxObjAction',
    'list' => 'listCustom',
    'abxEditPermissionList' => 'abxEditPermissionList',
    'abxEditPermission' => 'abxEditPermission',
    'permissionSingleList' => 'permissionSingleList',
    'abxQFieldRange' => 'abxQFieldRange',
    'abxOption4Query' => 'abxOption4Query',
    'fieldList' => 'fieldList',
    'sortFieldList' => 'sortFieldList',
    'abxProtocolUse' => 'abxProtocolUse',
    'filters' => 'filters',
    'QueryTotAttachResponse' => 'QueryTotAttachResponse',
    'abxRetQueryResult' => 'abxRetQueryResult',
    'abxResultsList' => 'abxResultsList',
    'abxResults' => 'abxResults',
    'abxQcHeadList' => 'abxQcHeadList',
    'abxQcHead' => 'abxQcHead',
    'abxQrowList' => 'abxQrowList',
    'abxQrow' => 'abxQrow',
    'canModifyRaccoglitore' => 'canModifyRaccoglitore',
    'canModifyRaccoglitoreResponse' => 'canModifyRaccoglitoreResponse',
    'GetFileListByCode' => 'GetFileListByCode',
    'GetFileListByCodeResponse' => 'GetFileListByCodeResponse',
    'abxFileResult' => 'abxFileResult',
    'abxFileList' => 'abxFileList',
    'abxFile' => 'abxFile',
    'downloadData' => 'downloadData',
    'uploadData' => 'uploadData',
    'abxAllPermission' => 'abxAllPermission',
    'list' => 'listCustom',
    'DestroyRaccoglitore' => 'DestroyRaccoglitore',
    'DestroyRaccoglitoreResponse' => 'DestroyRaccoglitoreResponse',
    'abxRaccoglitoreResult' => 'abxRaccoglitoreResult',
    'abxTemplateList' => 'abxTemplateList',
    'abxTemplate' => 'abxTemplate',
    'allDescription' => 'allDescription',
    'abxFieldList' => 'abxFieldList',
    'abxContainerList' => 'abxContainerList',
    'abxContainer' => 'abxContainer',
    'allDescription' => 'allDescription',
    'parentDataID' => 'parentDataID',
    'abxMasterDetail' => 'abxMasterDetail',
    'masterList' => 'masterList',
    'detailList' => 'detailList',
    'InsertUSFileWithUser' => 'InsertUSFileWithUser',
    'InsertUSFileWithUserResponse' => 'InsertUSFileWithUserResponse',
    'GetSDKLogList' => 'GetSDKLogList',
    'abxLog' => 'abxLog',
    'GetSDKLogListResponse' => 'GetSDKLogListResponse',
    'abxLogResult' => 'abxLogResult',
    'abxLogList' => 'abxLogList',
    'Fk_getRemoteFieldList' => 'Fk_getRemoteFieldList',
    'Fk_getRemoteFieldListResponse' => 'Fk_getRemoteFieldListResponse',
    'abxFKResult' => 'abxFKResult',
    'abxFKList' => 'abxFKList',
    'abxFK' => 'abxFK',
    'abxFkDb' => 'abxFkDb',
    'abxFKDbRecord' => 'abxFKDbRecord',
    'abxFKDbField' => 'abxFKDbField',
    'abxFKFieldMap' => 'abxFKFieldMap',
    'abxFKTableFields' => 'abxFKTableFields',
    'abxRmDatabaseList' => 'abxRmDatabaseList',
    'abxRmTableList' => 'abxRmTableList',
    'abxRmViewList' => 'abxRmViewList',
    'abxRmFieldList' => 'abxRmFieldList',
    'abxMultiFKList' => 'abxMultiFKList',
    'abxMultiFK' => 'abxMultiFK',
    'abxFkArchiboxRacc' => 'abxFkArchiboxRacc',
    'abxFKRaccRecord' => 'abxFKRaccRecord',
    'abxFkArchiboxUtenti' => 'abxFkArchiboxUtenti',
    'abxFKUtentiRecord' => 'abxFKUtentiRecord',
    'abxFKUtentiField' => 'abxFKUtentiField',
    'GetAllContainerExpressions' => 'GetAllContainerExpressions',
    'GetAllContainerExpressionsResponse' => 'GetAllContainerExpressionsResponse',
    'canDeleteDynorg' => 'canDeleteDynorg',
    'canDeleteDynorgResponse' => 'canDeleteDynorgResponse',
    'GetDataTPFileListByContainer' => 'GetDataTPFileListByContainer',
    'GetDataTPFileListByContainerResponse' => 'GetDataTPFileListByContainerResponse',
    'abxFileTpResult' => 'abxFileTpResult',
    'abxFileTpList' => 'abxFileTpList',
    'abxFileTp' => 'abxFileTp',
    'bindingExcel' => 'bindingExcel',
    'bindingWord' => 'bindingWord',
    'GetSDKImagesFromPDFTemplate' => 'GetSDKImagesFromPDFTemplate',
    'GetSDKImagesFromPDFTemplateResponse' => 'GetSDKImagesFromPDFTemplateResponse',
    'ModifyContainer' => 'ModifyContainer',
    'abxVersioningList' => 'abxVersioningList',
    'abxVersioning' => 'abxVersioning',
    'ModifyContainerResponse' => 'ModifyContainerResponse',
    'abxContainerResult' => 'abxContainerResult',
    'Fk_DB_testConnection' => 'Fk_DB_testConnection',
    'Fk_DB_testConnectionResponse' => 'Fk_DB_testConnectionResponse',
    'GetListMarker' => 'GetListMarker',
    'GetListMarkerResponse' => 'GetListMarkerResponse',
    'GetDataFileContainerDetail' => 'GetDataFileContainerDetail',
    'GetDataFileContainerDetailResponse' => 'GetDataFileContainerDetailResponse',
    'GetSDKTextFromTemplate' => 'GetSDKTextFromTemplate',
    'GetSDKTextFromTemplateResponse' => 'GetSDKTextFromTemplateResponse',
    'GetDataFileListWA' => 'GetDataFileListWA',
    'GetDataFileListWAResponse' => 'GetDataFileListWAResponse',
    'ModifyTemplate' => 'ModifyTemplate',
    'ModifyTemplateResponse' => 'ModifyTemplateResponse',
    'abxTemplateResult' => 'abxTemplateResult',
    'CanInsertFileContainer' => 'CanInsertFileContainer',
    'CanInsertFileContainerResponse' => 'CanInsertFileContainerResponse',
    'ModifyLinkContainerToContainer' => 'ModifyLinkContainerToContainer',
    'ModifyLinkContainerToContainerResponse' => 'ModifyLinkContainerToContainerResponse',
    'abxLinkResult' => 'abxLinkResult',
    'abxLinkList' => 'abxLinkList',
    'abxLink' => 'abxLink',
    'CreateDynorg' => 'CreateDynorg',
    'CreateDynorgResponse' => 'CreateDynorgResponse',
    'GetInstancePathname' => 'GetInstancePathname',
    'GetInstancePathnameResponse' => 'GetInstancePathnameResponse',
    'abxGipResult' => 'abxGipResult',
    'ValidateSDKTask' => 'ValidateSDKTask',
    'ValidateSDKTaskResponse' => 'ValidateSDKTaskResponse',
    'Login' => 'Login',
    'abxLoginIdentity' => 'abxLoginIdentity',
    'LoginResponse' => 'LoginResponse',
    'abxLoginResult' => 'abxLoginResult',
    'abxLoginInfo' => 'abxLoginInfo',
    'GetFieldList' => 'GetFieldList',
    'GetFieldListResponse' => 'GetFieldListResponse',
    'abxFieldResult' => 'abxFieldResult',
    'DownloadUSGetNext' => 'DownloadUSGetNext',
    'DownloadUSGetNextResponse' => 'DownloadUSGetNextResponse',
    'canCreateField' => 'canCreateField',
    'canCreateFieldResponse' => 'canCreateFieldResponse',
    'ModifyFileDescription' => 'ModifyFileDescription',
    'ModifyFileDescriptionResponse' => 'ModifyFileDescriptionResponse',
    'InsertData' => 'InsertData',
    'abxDataList' => 'abxDataList',
    'abxData' => 'abxData',
    'data' => 'data',
    'detailData' => 'detailData',
    'InsertDataResponse' => 'InsertDataResponse',
    'abxDataResult' => 'abxDataResult',
    'UploadWFSendChunk' => 'UploadWFSendChunk',
    'UploadWFSendChunkResponse' => 'UploadWFSendChunkResponse',
    'GetDataLimit' => 'GetDataLimit',
    'GetDataLimitResponse' => 'GetDataLimitResponse',
    'GetDataTPFileListByName' => 'GetDataTPFileListByName',
    'GetDataTPFileListByNameResponse' => 'GetDataTPFileListByNameResponse',
    'DownloadGetNextWA' => 'DownloadGetNextWA',
    'DownloadGetNextWAResponse' => 'DownloadGetNextWAResponse',
    'DownloadUSFile' => 'DownloadUSFile',
    'DownloadUSFileResponse' => 'DownloadUSFileResponse',
    'SetTmpTPUploadPath' => 'SetTmpTPUploadPath',
    'SetTmpTPUploadPathResponse' => 'SetTmpTPUploadPathResponse',
    'GetGroupsListByUser' => 'GetGroupsListByUser',
    'GetGroupsListByUserResponse' => 'GetGroupsListByUserResponse',
    'DownloadWFEndFile' => 'DownloadWFEndFile',
    'DownloadWFEndFileResponse' => 'DownloadWFEndFileResponse',
    'canDeleteTemplate' => 'canDeleteTemplate',
    'canDeleteTemplateResponse' => 'canDeleteTemplateResponse',
    'DeleteSDKLog' => 'DeleteSDKLog',
    'DeleteSDKLogResponse' => 'DeleteSDKLogResponse',
    'CopyData' => 'CopyData',
    'CopyDataResponse' => 'CopyDataResponse',
    'CreateSDKTaskWatchFolder' => 'CreateSDKTaskWatchFolder',
    'CreateSDKTaskWatchFolderResponse' => 'CreateSDKTaskWatchFolderResponse',
    'GetArchiBoxInfo' => 'GetArchiBoxInfo',
    'GetArchiBoxInfoResponse' => 'GetArchiBoxInfoResponse',
    'abxArchiBoxDomainResult' => 'abxArchiBoxDomainResult',
    'abxArchiBoxDomainList' => 'abxArchiBoxDomainList',
    'abxArchiBoxDomain' => 'abxArchiBoxDomain',
    'Fk_getCountAllRecordByIndexDesc' => 'Fk_getCountAllRecordByIndexDesc',
    'Fk_getCountAllRecordByIndexDescResponse' => 'Fk_getCountAllRecordByIndexDescResponse',
    'GetSDKTaskFieldMapping' => 'GetSDKTaskFieldMapping',
    'GetSDKTaskFieldMappingResponse' => 'GetSDKTaskFieldMappingResponse',
    'DeleteTPFileByCode' => 'DeleteTPFileByCode',
    'DeleteTPFileByCodeResponse' => 'DeleteTPFileByCodeResponse',
    'MoveData' => 'MoveData',
    'MoveDataResponse' => 'MoveDataResponse',
    'ModifyUser' => 'ModifyUser',
    'ModifyUserResponse' => 'ModifyUserResponse',
    'GetSchedulerTasks' => 'GetSchedulerTasks',
    'GetSchedulerTasksResponse' => 'GetSchedulerTasksResponse',
    'abxSchedulerResult' => 'abxSchedulerResult',
    'abxSchedulerTaskList' => 'abxSchedulerTaskList',
    'abxSchedulerTask' => 'abxSchedulerTask',
    'abxSchedule' => 'abxSchedule',
    'ModifyField' => 'ModifyField',
    'abxCombo' => 'abxCombo',
    'abxComboRecord' => 'abxComboRecord',
    'ModifyFieldResponse' => 'ModifyFieldResponse',
    'ExistUserByUsername' => 'ExistUserByUsername',
    'ExistUserByUsernameResponse' => 'ExistUserByUsernameResponse',
    'GetDownloadDetailByContId' => 'GetDownloadDetailByContId',
    'GetDownloadDetailByContIdResponse' => 'GetDownloadDetailByContIdResponse',
    'CreateSDKTaskFieldMapping' => 'CreateSDKTaskFieldMapping',
    'CreateSDKTaskFieldMappingResponse' => 'CreateSDKTaskFieldMappingResponse',
    'GetUserListActiveDirectory' => 'GetUserListActiveDirectory',
    'GetUserListActiveDirectoryResponse' => 'GetUserListActiveDirectoryResponse',
    'RegenerateDynOrg' => 'RegenerateDynOrg',
    'RegenerateDynOrgResponse' => 'RegenerateDynOrgResponse',
    'GetSchedulerTaskByTaskTypeId' => 'GetSchedulerTaskByTaskTypeId',
    'GetSchedulerTaskByTaskTypeIdResponse' => 'GetSchedulerTaskByTaskTypeIdResponse',
    'DownloadUSGetChunk' => 'DownloadUSGetChunk',
    'DownloadUSGetChunkResponse' => 'DownloadUSGetChunkResponse',
    'GetProtocolByNameDesc' => 'GetProtocolByNameDesc',
    'GetProtocolByNameDescResponse' => 'GetProtocolByNameDescResponse',
    'GetDynorgTypeList' => 'GetDynorgTypeList',
    'GetDynorgTypeListResponse' => 'GetDynorgTypeListResponse',
    'canDeleteRaccoglitore' => 'canDeleteRaccoglitore',
    'canDeleteRaccoglitoreResponse' => 'canDeleteRaccoglitoreResponse',
    'GetTemplateList' => 'GetTemplateList',
    'GetTemplateListResponse' => 'GetTemplateListResponse',
    'UploadUSSendChunk' => 'UploadUSSendChunk',
    'UploadUSSendChunkResponse' => 'UploadUSSendChunkResponse',
    'GetInstanceNameFromLinks' => 'GetInstanceNameFromLinks',
    'GetInstanceNameFromLinksResponse' => 'GetInstanceNameFromLinksResponse',
    'GetTreeForSecurity' => 'GetTreeForSecurity',
    'abxTreeParam' => 'abxTreeParam',
    'objvect' => 'objvect',
    'GetTreeForSecurityResponse' => 'GetTreeForSecurityResponse',
    'abxTreeResult' => 'abxTreeResult',
    'abxTree' => 'abxTree',
    'abxTreeElement' => 'abxTreeElement',
    'Logout' => 'Logout',
    'LogoutResponse' => 'LogoutResponse',
    'DeleteGroup' => 'DeleteGroup',
    'DeleteGroupResponse' => 'DeleteGroupResponse',
    'abxGroupResult' => 'abxGroupResult',
    'GetFileListByCodeForSecurity' => 'GetFileListByCodeForSecurity',
    'GetFileListByCodeForSecurityResponse' => 'GetFileListByCodeForSecurityResponse',
    'SetFileAvailable' => 'SetFileAvailable',
    'SetFileAvailableResponse' => 'SetFileAvailableResponse',
    'Fk_getCountAllRecord' => 'Fk_getCountAllRecord',
    'Fk_getCountAllRecordResponse' => 'Fk_getCountAllRecordResponse',
    'GetExpression' => 'GetExpression',
    'GetExpressionResponse' => 'GetExpressionResponse',
    'DeleteField' => 'DeleteField',
    'DeleteFieldResponse' => 'DeleteFieldResponse',
    'GetSDKTasks' => 'GetSDKTasks',
    'GetSDKTasksResponse' => 'GetSDKTasksResponse',
    'GetContSignByUser' => 'GetContSignByUser',
    'GetContSignByUserResponse' => 'GetContSignByUserResponse',
    'Fk_create' => 'Fk_create',
    'Fk_createResponse' => 'Fk_createResponse',
    'Fk_getColumnsName' => 'Fk_getColumnsName',
    'Fk_getColumnsNameResponse' => 'Fk_getColumnsNameResponse',
    'InsertFileContainer' => 'InsertFileContainer',
    'InsertFileContainerResponse' => 'InsertFileContainerResponse',
    'GetContainerLinks' => 'GetContainerLinks',
    'GetContainerLinksResponse' => 'GetContainerLinksResponse',
    'DeleteTPFileById' => 'DeleteTPFileById',
    'DeleteTPFileByIdResponse' => 'DeleteTPFileByIdResponse',
    'canDeleteContainer' => 'canDeleteContainer',
    'canDeleteContainerResponse' => 'canDeleteContainerResponse',
    'IfFileExist' => 'IfFileExist',
    'IfFileExistResponse' => 'IfFileExistResponse',
    'DownloadTPFile' => 'DownloadTPFile',
    'DownloadTPFileResponse' => 'DownloadTPFileResponse',
    'SetInstanceReplication' => 'SetInstanceReplication',
    'abxReplicationList' => 'abxReplicationList',
    'abxArchiBoxInDomain' => 'abxArchiBoxInDomain',
    'SetInstanceReplicationResponse' => 'SetInstanceReplicationResponse',
    'abxReplicationResult' => 'abxReplicationResult',
    'Fk_getRemoteTableList' => 'Fk_getRemoteTableList',
    'Fk_getRemoteTableListResponse' => 'Fk_getRemoteTableListResponse',
    'GetDataFileListOnlyLastVersion' => 'GetDataFileListOnlyLastVersion',
    'GetDataFileListOnlyLastVersionResponse' => 'GetDataFileListOnlyLastVersionResponse',
    'DelMarker' => 'DelMarker',
    'DelMarkerResponse' => 'DelMarkerResponse',
    'ModDefaultProcess' => 'ModDefaultProcess',
    'ModDefaultProcessResponse' => 'ModDefaultProcessResponse',
    'canModifyTemplate' => 'canModifyTemplate',
    'canModifyTemplateResponse' => 'canModifyTemplateResponse',
    'GetSDKRules' => 'GetSDKRules',
    'GetSDKRulesResponse' => 'GetSDKRulesResponse',
    'GetTranslationByRangeLabelCode' => 'GetTranslationByRangeLabelCode',
    'GetTranslationByRangeLabelCodeResponse' => 'GetTranslationByRangeLabelCodeResponse',
    'abxTranslationResult' => 'abxTranslationResult',
    'abxTranslationList' => 'abxTranslationList',
    'GetCountDocumentLinks' => 'GetCountDocumentLinks',
    'GetCountDocumentLinksResponse' => 'GetCountDocumentLinksResponse',
    'DeleteFileContainer' => 'DeleteFileContainer',
    'DeleteFileContainerResponse' => 'DeleteFileContainerResponse',
    'Ping' => 'Ping',
    'PingResponse' => 'PingResponse',
    'AbxPingResult' => 'AbxPingResult',
    'GetUploadDetailByFilecode' => 'GetUploadDetailByFilecode',
    'GetUploadDetailByFilecodeResponse' => 'GetUploadDetailByFilecodeResponse',
    'CanAddNewYear' => 'CanAddNewYear',
    'CanAddNewYearResponse' => 'CanAddNewYearResponse',
    'InsertUser' => 'InsertUser',
    'InsertUserResponse' => 'InsertUserResponse',
    'GetDataUSFileListByUsername' => 'GetDataUSFileListByUsername',
    'GetDataUSFileListByUsernameResponse' => 'GetDataUSFileListByUsernameResponse',
    'canModifyField' => 'canModifyField',
    'canModifyFieldResponse' => 'canModifyFieldResponse',
    'ModifyFilter' => 'ModifyFilter',
    'AbxFilter' => 'AbxFilter',
    'ModifyFilterResponse' => 'ModifyFilterResponse',
    'AbxFilterResult' => 'AbxFilterResult',
    'AbxFilterList' => 'AbxFilterList',
    'InsertGroup' => 'InsertGroup',
    'InsertGroupResponse' => 'InsertGroupResponse',
    'GetProtocolById' => 'GetProtocolById',
    'GetProtocolByIdResponse' => 'GetProtocolByIdResponse',
    'GetData' => 'GetData',
    'GetDataResponse' => 'GetDataResponse',
    'canDeleteField' => 'canDeleteField',
    'canDeleteFieldResponse' => 'canDeleteFieldResponse',
    'AddDefaultProcess' => 'AddDefaultProcess',
    'AddDefaultProcessResponse' => 'AddDefaultProcessResponse',
    'ValidateSession' => 'ValidateSession',
    'ValidateSessionResponse' => 'ValidateSessionResponse',
    'Fk_getCountAllRecordByDesc' => 'Fk_getCountAllRecordByDesc',
    'Fk_getCountAllRecordByDescResponse' => 'Fk_getCountAllRecordByDescResponse',
    'SchedulerTaskScheduleProcessed' => 'SchedulerTaskScheduleProcessed',
    'schedule' => 'schedule',
    'SchedulerTaskScheduleProcessedResponse' => 'SchedulerTaskScheduleProcessedResponse',
    'DownloadWFFile' => 'DownloadWFFile',
    'DownloadWFFileResponse' => 'DownloadWFFileResponse',
    'EditProtocol' => 'EditProtocol',
    'EditProtocolResponse' => 'EditProtocolResponse',
    'GetDataTPFileDetail' => 'GetDataTPFileDetail',
    'GetDataTPFileDetailResponse' => 'GetDataTPFileDetailResponse',
    'GetDataCountWithoutPermission' => 'GetDataCountWithoutPermission',
    'GetDataCountWithoutPermissionResponse' => 'GetDataCountWithoutPermissionResponse',
    'InsertLinkContainerToContainer' => 'InsertLinkContainerToContainer',
    'InsertLinkContainerToContainerResponse' => 'InsertLinkContainerToContainerResponse',
    'GetSign' => 'GetSign',
    'GetSignResponse' => 'GetSignResponse',
    'UploadUSEndFile' => 'UploadUSEndFile',
    'UploadUSEndFileResponse' => 'UploadUSEndFileResponse',
    'DelDefaultProcess' => 'DelDefaultProcess',
    'DelDefaultProcessResponse' => 'DelDefaultProcessResponse',
    'GetDataCountWithPermission' => 'GetDataCountWithPermission',
    'GetDataCountWithPermissionResponse' => 'GetDataCountWithPermissionResponse',
    'GetExpressionValue' => 'GetExpressionValue',
    'GetExpressionValueResponse' => 'GetExpressionValueResponse',
    'GetLanguages' => 'GetLanguages',
    'GetLanguagesResponse' => 'GetLanguagesResponse',
    'abxLanguageResult' => 'abxLanguageResult',
    'abxLanguageList' => 'abxLanguageList',
    'abxLanguage' => 'abxLanguage',
    'CanDeleteLinkFromContainer' => 'CanDeleteLinkFromContainer',
    'CanDeleteLinkFromContainerResponse' => 'CanDeleteLinkFromContainerResponse',
    'TestScritturaLettura' => 'TestScritturaLettura',
    'TestScritturaLetturaResponse' => 'TestScritturaLetturaResponse',
    'DeleteTemplate' => 'DeleteTemplate',
    'DeleteTemplateResponse' => 'DeleteTemplateResponse',
    'DeleteRaccoglitore' => 'DeleteRaccoglitore',
    'DeleteRaccoglitoreResponse' => 'DeleteRaccoglitoreResponse',
    'DeleteFile' => 'DeleteFile',
    'DeleteFileResponse' => 'DeleteFileResponse',
    'ModUserSettings' => 'ModUserSettings',
    'ModUserSettingsResponse' => 'ModUserSettingsResponse',
    'InsertLinkContainerToDocument' => 'InsertLinkContainerToDocument',
    'InsertLinkContainerToDocumentResponse' => 'InsertLinkContainerToDocumentResponse',
    'CopyFile' => 'CopyFile',
    'CopyFileResponse' => 'CopyFileResponse',
    'GetTree' => 'GetTree',
    'GetTreeResponse' => 'GetTreeResponse',
    'CanInsertLinkDocumentToDocument' => 'CanInsertLinkDocumentToDocument',
    'CanInsertLinkDocumentToDocumentResponse' => 'CanInsertLinkDocumentToDocumentResponse',
    'GetDataUSFileDetail' => 'GetDataUSFileDetail',
    'GetDataUSFileDetailResponse' => 'GetDataUSFileDetailResponse',
    'ModUser' => 'ModUser',
    'ModUserResponse' => 'ModUserResponse',
    'DeleteSchedulerTaskSchedule' => 'DeleteSchedulerTaskSchedule',
    'DeleteSchedulerTaskScheduleResponse' => 'DeleteSchedulerTaskScheduleResponse',
    'AddMarker' => 'AddMarker',
    'AddMarkerResponse' => 'AddMarkerResponse',
    'GetDocumentLinks' => 'GetDocumentLinks',
    'GetDocumentLinksResponse' => 'GetDocumentLinksResponse',
    'GetInstanceReplicationStatus' => 'GetInstanceReplicationStatus',
    'GetInstanceReplicationStatusResponse' => 'GetInstanceReplicationStatusResponse',
    'Fk_getPars' => 'Fk_getPars',
    'Fk_getParsResponse' => 'Fk_getParsResponse',
    'CheckOut_attachContainer' => 'CheckOut_attachContainer',
    'CheckOut_attachContainerResponse' => 'CheckOut_attachContainerResponse',
    'abxCheckinResult' => 'abxCheckinResult',
    'abxCheckinList' => 'abxCheckinList',
    'abxCheckin' => 'abxCheckin',
    'GetTranslationByMessageId' => 'GetTranslationByMessageId',
    'GetTranslationByMessageIdResponse' => 'GetTranslationByMessageIdResponse',
    'GetSDKTaskExcelPreview' => 'GetSDKTaskExcelPreview',
    'GetSDKTaskExcelPreviewResponse' => 'GetSDKTaskExcelPreviewResponse',
    'CheckIn_attach' => 'CheckIn_attach',
    'CheckIn_attachResponse' => 'CheckIn_attachResponse',
    'SetTmpWFUploadPath' => 'SetTmpWFUploadPath',
    'SetTmpWFUploadPathResponse' => 'SetTmpWFUploadPathResponse',
    'ModifyData' => 'ModifyData',
    'ModifyDataResponse' => 'ModifyDataResponse',
    'GetDownloadDetailByCont' => 'GetDownloadDetailByCont',
    'GetDownloadDetailByContResponse' => 'GetDownloadDetailByContResponse',
    'Fk_getParsAllFk' => 'Fk_getParsAllFk',
    'Fk_getParsAllFkResponse' => 'Fk_getParsAllFkResponse',
    'GetLinksToDocument' => 'GetLinksToDocument',
    'GetLinksToDocumentResponse' => 'GetLinksToDocumentResponse',
    'UploadEndFileContainer' => 'UploadEndFileContainer',
    'UploadEndFileContainerResponse' => 'UploadEndFileContainerResponse',
    'GetDownloadDetailByDataId' => 'GetDownloadDetailByDataId',
    'GetDownloadDetailByDataIdResponse' => 'GetDownloadDetailByDataIdResponse',
    'GetDataWAById' => 'GetDataWAById',
    'GetDataWAByIdResponse' => 'GetDataWAByIdResponse',
    'GetArchiBoxInDomain' => 'GetArchiBoxInDomain',
    'GetArchiBoxInDomainResponse' => 'GetArchiBoxInDomainResponse',
    'Fk_WS_insert' => 'Fk_WS_insert',
    'Fk_WS_insertResponse' => 'Fk_WS_insertResponse',
    'CanDeleteData' => 'CanDeleteData',
    'CanDeleteDataResponse' => 'CanDeleteDataResponse',
    'Fk_getRemoteViewList' => 'Fk_getRemoteViewList',
    'Fk_getRemoteViewListResponse' => 'Fk_getRemoteViewListResponse',
    'GetDataByIdForSecurity' => 'GetDataByIdForSecurity',
    'GetDataByIdForSecurityResponse' => 'GetDataByIdForSecurityResponse',
    'ModifyUserConfig' => 'ModifyUserConfig',
    'ModifyUserConfigResponse' => 'ModifyUserConfigResponse',
    'VerifyExpression' => 'VerifyExpression',
    'VerifyExpressionResponse' => 'VerifyExpressionResponse',
    'DeleteProtocol' => 'DeleteProtocol',
    'DeleteProtocolResponse' => 'DeleteProtocolResponse',
    'DelSign' => 'DelSign',
    'DelSignResponse' => 'DelSignResponse',
    'DeleteFilter' => 'DeleteFilter',
    'DeleteFilterResponse' => 'DeleteFilterResponse',
    'CreateRaccoglitore' => 'CreateRaccoglitore',
    'CreateRaccoglitoreResponse' => 'CreateRaccoglitoreResponse',
    'CanInsertLinkContainerToContainer' => 'CanInsertLinkContainerToContainer',
    'CanInsertLinkContainerToContainerResponse' => 'CanInsertLinkContainerToContainerResponse',
    'UploadEndFileWA' => 'UploadEndFileWA',
    'UploadEndFileWAResponse' => 'UploadEndFileWAResponse',
    'canCreateRaccoglitore' => 'canCreateRaccoglitore',
    'parentDataID' => 'parentDataID',
    'canCreateRaccoglitoreResponse' => 'canCreateRaccoglitoreResponse',
    'CanModifyLinkContainerToContainer' => 'CanModifyLinkContainerToContainer',
    'CanModifyLinkContainerToContainerResponse' => 'CanModifyLinkContainerToContainerResponse',
    'GetSDKWatchFolderDirectories' => 'GetSDKWatchFolderDirectories',
    'GetSDKWatchFolderDirectoriesResponse' => 'GetSDKWatchFolderDirectoriesResponse',
    'GetQueryParam' => 'GetQueryParam',
    'GetQueryParamResponse' => 'GetQueryParamResponse',
    'abxRetOption4QueryResult' => 'abxRetOption4QueryResult',
    'abxQFieldList' => 'abxQFieldList',
    'abxQobjectList' => 'abxQobjectList',
    'abxQobject' => 'abxQobject',
    'abxQtemplateList' => 'abxQtemplateList',
    'abxQtemplate' => 'abxQtemplate',
    'GetArchSostRules' => 'GetArchSostRules',
    'GetArchSostRulesResponse' => 'GetArchSostRulesResponse',
    'abxArchSostResult' => 'abxArchSostResult',
    'abxArchSostRuleList' => 'abxArchSostRuleList',
    'abxArchSostRule' => 'abxArchSostRule',
    'abxArchSostRuleFilters' => 'abxArchSostRuleFilters',
    'abxArchSostRuleMap' => 'abxArchSostRuleMap',
    'GetSDKVariables' => 'GetSDKVariables',
    'GetSDKVariablesResponse' => 'GetSDKVariablesResponse',
    'DownloadFileWAByFileUniqueCode' => 'DownloadFileWAByFileUniqueCode',
    'DownloadFileWAByFileUniqueCodeResponse' => 'DownloadFileWAByFileUniqueCodeResponse',
    'DownloadEndFileWA' => 'DownloadEndFileWA',
    'DownloadEndFileWAResponse' => 'DownloadEndFileWAResponse',
    'DeleteClasseDocumentale' => 'DeleteClasseDocumentale',
    'DeleteClasseDocumentaleResponse' => 'DeleteClasseDocumentaleResponse',
    'abxClasseDocumentaleResult' => 'abxClasseDocumentaleResult',
    'abxClasseDocumentaleList' => 'abxClasseDocumentaleList',
    'abxClasseDocumentale' => 'abxClasseDocumentale',
    'Metadata' => 'Metadata',
    'CanDeleteFile' => 'CanDeleteFile',
    'CanDeleteFileResponse' => 'CanDeleteFileResponse',
    'EndPermissionSettings' => 'EndPermissionSettings',
    'EndPermissionSettingsResponse' => 'EndPermissionSettingsResponse',
    'abxPermissionResult' => 'abxPermissionResult',
    'abxPermissionElenco' => 'abxPermissionElenco',
    'InsertUserInGroup' => 'InsertUserInGroup',
    'InsertUserInGroupResponse' => 'InsertUserInGroupResponse',
    'canCreateContainer' => 'canCreateContainer',
    'parentDataID' => 'parentDataID',
    'canCreateContainerResponse' => 'canCreateContainerResponse',
    'GetDownloadDetailByFilecode' => 'GetDownloadDetailByFilecode',
    'GetDownloadDetailByFilecodeResponse' => 'GetDownloadDetailByFilecodeResponse',
    'GetAllFilter' => 'GetAllFilter',
    'GetAllFilterResponse' => 'GetAllFilterResponse',
    'Fk_getAllRecordByIndex' => 'Fk_getAllRecordByIndex',
    'Fk_getAllRecordByIndexResponse' => 'Fk_getAllRecordByIndexResponse',
    'InsertClasseDocumentale' => 'InsertClasseDocumentale',
    'InsertClasseDocumentaleResponse' => 'InsertClasseDocumentaleResponse',
    'CheckOut_document' => 'CheckOut_document',
    'CheckOut_documentResponse' => 'CheckOut_documentResponse',
    'DownloadGetNext' => 'DownloadGetNext',
    'DownloadGetNextResponse' => 'DownloadGetNextResponse',
    'SetTmpUSDownloadPath' => 'SetTmpUSDownloadPath',
    'SetTmpUSDownloadPathResponse' => 'SetTmpUSDownloadPathResponse',
    'canCreateTemplate' => 'canCreateTemplate',
    'canCreateTemplateResponse' => 'canCreateTemplateResponse',
    'CanDeleteFileContainer' => 'CanDeleteFileContainer',
    'CanDeleteFileContainerResponse' => 'CanDeleteFileContainerResponse',
    'QueryHeader' => 'QueryHeader',
    'QueryHeaderResponse' => 'QueryHeaderResponse',
    'GetProtocolList' => 'GetProtocolList',
    'GetProtocolListResponse' => 'GetProtocolListResponse',
    'GetFieldsPropertiesFromTemplate' => 'GetFieldsPropertiesFromTemplate',
    'GetFieldsPropertiesFromTemplateResponse' => 'GetFieldsPropertiesFromTemplateResponse',
    'CheckOut_attach' => 'CheckOut_attach',
    'CheckOut_attachResponse' => 'CheckOut_attachResponse',
    'DeleteDataWA' => 'DeleteDataWA',
    'DeleteDataWAResponse' => 'DeleteDataWAResponse',
    'DeleteArchSostRule' => 'DeleteArchSostRule',
    'DeleteArchSostRuleResponse' => 'DeleteArchSostRuleResponse',
    'GetMethod' => 'GetMethod',
    'GetMethodResponse' => 'GetMethodResponse',
    'abxGmResult' => 'abxGmResult',
    'abxMethodDef' => 'abxMethodDef',
    'elmethod' => 'elmethod',
    'CanAddNewDate' => 'CanAddNewDate',
    'CanAddNewDateResponse' => 'CanAddNewDateResponse',
    'ModifySDKTask' => 'ModifySDKTask',
    'ModifySDKTaskResponse' => 'ModifySDKTaskResponse',
    'GetArchiBoxInDomainByMatricola' => 'GetArchiBoxInDomainByMatricola',
    'GetArchiBoxInDomainByMatricolaResponse' => 'GetArchiBoxInDomainByMatricolaResponse',
    'InsertTranslationCode' => 'InsertTranslationCode',
    'InsertTranslationCodeResponse' => 'InsertTranslationCodeResponse',
    'GetGroupList' => 'GetGroupList',
    'GetGroupListResponse' => 'GetGroupListResponse',
    'Fk_getAllRecordByIndexDesc' => 'Fk_getAllRecordByIndexDesc',
    'Fk_getAllRecordByIndexDescResponse' => 'Fk_getAllRecordByIndexDescResponse',
    'CanModifyData' => 'CanModifyData',
    'CanModifyDataResponse' => 'CanModifyDataResponse',
    'CanAddDigitalSignature' => 'CanAddDigitalSignature',
    'CanAddDigitalSignatureResponse' => 'CanAddDigitalSignatureResponse',
    'Query' => 'Query',
    'QueryResponse' => 'QueryResponse',
    'GetInstanceId' => 'GetInstanceId',
    'GetInstanceIdResponse' => 'GetInstanceIdResponse',
    'abxGiiResult' => 'abxGiiResult',
    'InsertArchSostRule' => 'InsertArchSostRule',
    'InsertArchSostRuleResponse' => 'InsertArchSostRuleResponse',
    'Combo_insert' => 'Combo_insert',
    'Combo_insertResponse' => 'Combo_insertResponse',
    'abxComboResult' => 'abxComboResult',
    'abxComboList' => 'abxComboList',
    'ExtractSDKPDFTemplateTextByArea' => 'ExtractSDKPDFTemplateTextByArea',
    'ExtractSDKPDFTemplateTextByAreaResponse' => 'ExtractSDKPDFTemplateTextByAreaResponse',
    'GetDefaultObjActList' => 'GetDefaultObjActList',
    'GetDefaultObjActListResponse' => 'GetDefaultObjActListResponse',
    'GetAdjacentArchiBox' => 'GetAdjacentArchiBox',
    'GetAdjacentArchiBoxResponse' => 'GetAdjacentArchiBoxResponse',
    'DeleteSDKTask' => 'DeleteSDKTask',
    'DeleteSDKTaskResponse' => 'DeleteSDKTaskResponse',
    'DownloadTPEndFile' => 'DownloadTPEndFile',
    'DownloadTPEndFileResponse' => 'DownloadTPEndFileResponse',
    'GetUploadDetailByContId' => 'GetUploadDetailByContId',
    'GetUploadDetailByContIdResponse' => 'GetUploadDetailByContIdResponse',
    'GetLinksToDocumentFiltered' => 'GetLinksToDocumentFiltered',
    'GetLinksToDocumentFilteredResponse' => 'GetLinksToDocumentFilteredResponse',
    'Fk_getRemoteDatabaseList' => 'Fk_getRemoteDatabaseList',
    'Fk_getRemoteDatabaseListResponse' => 'Fk_getRemoteDatabaseListResponse',
    'GetDataFileListForSecurity' => 'GetDataFileListForSecurity',
    'GetDataFileListForSecurityResponse' => 'GetDataFileListForSecurityResponse',
    'GetUploadDetailByData' => 'GetUploadDetailByData',
    'GetUploadDetailByDataResponse' => 'GetUploadDetailByDataResponse',
    'DownloadGetChunkWA' => 'DownloadGetChunkWA',
    'DownloadGetChunkWAResponse' => 'DownloadGetChunkWAResponse',
    'GetWsdlVersion' => 'GetWsdlVersion',
    'GetWsdlVersionResponse' => 'GetWsdlVersionResponse',
    'AbxWsdlResult' => 'AbxWsdlResult',
    'InsertUSFile' => 'InsertUSFile',
    'InsertUSFileResponse' => 'InsertUSFileResponse',
    'InsertProtocol' => 'InsertProtocol',
    'InsertProtocolResponse' => 'InsertProtocolResponse',
    'DownloadFilePreview' => 'DownloadFilePreview',
    'DownloadFilePreviewResponse' => 'DownloadFilePreviewResponse',
    'AddFileToSyncByArcCue' => 'AddFileToSyncByArcCue',
    'AddFileToSyncByArcCueResponse' => 'AddFileToSyncByArcCueResponse',
    'AddLogSDK' => 'AddLogSDK',
    'AddLogSDKResponse' => 'AddLogSDKResponse',
    'DigitalSign' => 'DigitalSign',
    'DigitalSignResponse' => 'DigitalSignResponse',
    'GetUploadDetailByCont' => 'GetUploadDetailByCont',
    'GetUploadDetailByContResponse' => 'GetUploadDetailByContResponse',
    'GetFieldProperties' => 'GetFieldProperties',
    'GetFieldPropertiesResponse' => 'GetFieldPropertiesResponse',
    'DelExpression' => 'DelExpression',
    'DelExpressionResponse' => 'DelExpressionResponse',
    'SetTmpUploadPath' => 'SetTmpUploadPath',
    'SetTmpUploadPathResponse' => 'SetTmpUploadPathResponse',
    'CanEditProtocol' => 'CanEditProtocol',
    'CanEditProtocolResponse' => 'CanEditProtocolResponse',
    'GetUserList' => 'GetUserList',
    'GetUserListResponse' => 'GetUserListResponse',
    'DeleteUSFileByCode' => 'DeleteUSFileByCode',
    'DeleteUSFileByCodeResponse' => 'DeleteUSFileByCodeResponse',
    'UploadTPSendChunk' => 'UploadTPSendChunk',
    'UploadTPSendChunkResponse' => 'UploadTPSendChunkResponse',
    'DownloadFileContainer' => 'DownloadFileContainer',
    'DownloadFileContainerResponse' => 'DownloadFileContainerResponse',
    'SetTmpTPDownloadPath' => 'SetTmpTPDownloadPath',
    'SetTmpTPDownloadPathResponse' => 'SetTmpTPDownloadPathResponse',
    'DeleteUSFileById' => 'DeleteUSFileById',
    'DeleteUSFileByIdResponse' => 'DeleteUSFileByIdResponse',
    'DeleteTranslationByCode' => 'DeleteTranslationByCode',
    'DeleteTranslationByCodeResponse' => 'DeleteTranslationByCodeResponse',
    'InsertFilter' => 'InsertFilter',
    'InsertFilterResponse' => 'InsertFilterResponse',
    'GetDataFileList' => 'GetDataFileList',
    'GetDataFileListResponse' => 'GetDataFileListResponse',
    'GetDataTPFileList' => 'GetDataTPFileList',
    'GetDataTPFileListResponse' => 'GetDataTPFileListResponse',
    'GetRootId' => 'GetRootId',
    'GetRootIdResponse' => 'GetRootIdResponse',
    'GetTranslationByLabelCode' => 'GetTranslationByLabelCode',
    'GetTranslationByLabelCodeResponse' => 'GetTranslationByLabelCodeResponse',
    'GetSchedulerTasksToRun' => 'GetSchedulerTasksToRun',
    'GetSchedulerTasksToRunResponse' => 'GetSchedulerTasksToRunResponse',
    'DownloadFileByFileUniqueCode' => 'DownloadFileByFileUniqueCode',
    'DownloadFileByFileUniqueCodeResponse' => 'DownloadFileByFileUniqueCodeResponse',
    'ModifyRaccoglitore' => 'ModifyRaccoglitore',
    'ModifyRaccoglitoreResponse' => 'ModifyRaccoglitoreResponse',
    'SetTmpUSUploadPath' => 'SetTmpUSUploadPath',
    'SetTmpUSUploadPathResponse' => 'SetTmpUSUploadPathResponse',
    'Fk_DB_modify' => 'Fk_DB_modify',
    'Fk_DB_modifyResponse' => 'Fk_DB_modifyResponse',
    'UploadWFEndFile' => 'UploadWFEndFile',
    'UploadWFEndFileResponse' => 'UploadWFEndFileResponse',
    'GetDataFileListContainer' => 'GetDataFileListContainer',
    'GetDataFileListContainerResponse' => 'GetDataFileListContainerResponse',
    'ModSign' => 'ModSign',
    'ModSignResponse' => 'ModSignResponse',
    'Combo_getAll' => 'Combo_getAll',
    'Combo_getAllResponse' => 'Combo_getAllResponse',
    'DownloadGetChunk' => 'DownloadGetChunk',
    'DownloadGetChunkResponse' => 'DownloadGetChunkResponse',
    'ModifyGroup' => 'ModifyGroup',
    'ModifyGroupResponse' => 'ModifyGroupResponse',
    'InsertUserConfig' => 'InsertUserConfig',
    'InsertUserConfigResponse' => 'InsertUserConfigResponse',
    'GetProtocolByName' => 'GetProtocolByName',
    'GetProtocolByNameResponse' => 'GetProtocolByNameResponse',
    'canModifyContainer' => 'canModifyContainer',
    'canModifyContainerResponse' => 'canModifyContainerResponse',
    'InsertTranslationDecimalCode' => 'InsertTranslationDecimalCode',
    'InsertTranslationDecimalCodeResponse' => 'InsertTranslationDecimalCodeResponse',
    'GetTranslationBySourceSuffix' => 'GetTranslationBySourceSuffix',
    'GetTranslationBySourceSuffixResponse' => 'GetTranslationBySourceSuffixResponse',
    'GetDynorgList' => 'GetDynorgList',
    'GetDynorgListResponse' => 'GetDynorgListResponse',
    'Fk_DB_delete' => 'Fk_DB_delete',
    'Fk_DB_deleteResponse' => 'Fk_DB_deleteResponse',
    'UploadTPEndFile' => 'UploadTPEndFile',
    'UploadTPEndFileResponse' => 'UploadTPEndFileResponse',
    'AddUserSettings' => 'AddUserSettings',
    'AddUserSettingsResponse' => 'AddUserSettingsResponse',
    'GetUploadDetailByDataId' => 'GetUploadDetailByDataId',
    'GetUploadDetailByDataIdResponse' => 'GetUploadDetailByDataIdResponse',
    'Combo_removeItem' => 'Combo_removeItem',
    'Combo_removeItemResponse' => 'Combo_removeItemResponse',
    'ModifyDynorg' => 'ModifyDynorg',
    'ModifyDynorgResponse' => 'ModifyDynorgResponse',
    'GetDataById' => 'GetDataById',
    'GetDataByIdResponse' => 'GetDataByIdResponse',
    'DeleteWFFileByCode' => 'DeleteWFFileByCode',
    'DeleteWFFileByCodeResponse' => 'DeleteWFFileByCodeResponse',
    'GetListDataWA' => 'GetListDataWA',
    'GetListDataWAResponse' => 'GetListDataWAResponse',
    'GetContSign' => 'GetContSign',
    'GetContSignResponse' => 'GetContSignResponse',
    'GetDomainList' => 'GetDomainList',
    'GetDomainListResponse' => 'GetDomainListResponse',
    'abxDomainResult' => 'abxDomainResult',
    'abxDomainList' => 'abxDomainList',
    'abxDomain' => 'abxDomain',
    'UploadSendChunkWA' => 'UploadSendChunkWA',
    'UploadSendChunkWAResponse' => 'UploadSendChunkWAResponse',
    'GetNewProtocolNumber' => 'GetNewProtocolNumber',
    'GetNewProtocolNumberResponse' => 'GetNewProtocolNumberResponse',
    'abxProtocolUseResult' => 'abxProtocolUseResult',
    'abxProtocolUseList' => 'abxProtocolUseList',
    'InsertLinkDocumentToDocument' => 'InsertLinkDocumentToDocument',
    'InsertLinkDocumentToDocumentResponse' => 'InsertLinkDocumentToDocumentResponse',
    'Fk_getAllRecordByDesc' => 'Fk_getAllRecordByDesc',
    'Fk_getAllRecordByDescResponse' => 'Fk_getAllRecordByDescResponse',
    'CanUseProtocol' => 'CanUseProtocol',
    'CanUseProtocolResponse' => 'CanUseProtocolResponse',
    'CreateContainer' => 'CreateContainer',
    'CreateContainerResponse' => 'CreateContainerResponse',
    'ChangeSchedulerTaskScheduleStatus' => 'ChangeSchedulerTaskScheduleStatus',
    'ChangeSchedulerTaskScheduleStatusResponse' => 'ChangeSchedulerTaskScheduleStatusResponse',
    'Fk_getLocalFieldList' => 'Fk_getLocalFieldList',
    'Fk_getLocalFieldListResponse' => 'Fk_getLocalFieldListResponse',
    'DeleteTranslation' => 'DeleteTranslation',
    'DeleteTranslationResponse' => 'DeleteTranslationResponse',
    'Combo_removeAll' => 'Combo_removeAll',
    'Combo_removeAllResponse' => 'Combo_removeAllResponse',
    'canModifyDynorg' => 'canModifyDynorg',
    'canModifyDynorgResponse' => 'canModifyDynorgResponse',
    'ModifyUserPassword' => 'ModifyUserPassword',
    'ModifyUserPasswordResponse' => 'ModifyUserPasswordResponse',
    'GetDataUSFileList' => 'GetDataUSFileList',
    'GetDataUSFileListResponse' => 'GetDataUSFileListResponse',
    'Combo_isCombo' => 'Combo_isCombo',
    'Combo_isComboResponse' => 'Combo_isComboResponse',
    'CanModifyLinkContainerToDocument' => 'CanModifyLinkContainerToDocument',
    'CanModifyLinkContainerToDocumentResponse' => 'CanModifyLinkContainerToDocumentResponse',
    'ModifyTranslation' => 'ModifyTranslation',
    'ModifyTranslationResponse' => 'ModifyTranslationResponse',
    'DeleteSchedulerTask' => 'DeleteSchedulerTask',
    'DeleteSchedulerTaskResponse' => 'DeleteSchedulerTaskResponse',
    'GetFileAvailable' => 'GetFileAvailable',
    'GetFileAvailableResponse' => 'GetFileAvailableResponse',
    'CanShowFile' => 'CanShowFile',
    'CanShowFileResponse' => 'CanShowFileResponse',
    'DeleteDynorg' => 'DeleteDynorg',
    'DeleteDynorgResponse' => 'DeleteDynorgResponse',
    'DeleteUserByUsername' => 'DeleteUserByUsername',
    'DeleteUserByUsernameResponse' => 'DeleteUserByUsernameResponse',
    'TestLettura' => 'TestLettura',
    'TestLetturaResponse' => 'TestLetturaResponse',
    'FullTreePathName' => 'FullTreePathName',
    'FullTreePathNameResponse' => 'FullTreePathNameResponse',
    'UploadEndFile' => 'UploadEndFile',
    'UploadEndFileResponse' => 'UploadEndFileResponse',
    'ModifyLinkContainerToDocument' => 'ModifyLinkContainerToDocument',
    'ModifyLinkContainerToDocumentResponse' => 'ModifyLinkContainerToDocumentResponse',
    'GetUserDetailByUserId' => 'GetUserDetailByUserId',
    'GetUserDetailByUserIdResponse' => 'GetUserDetailByUserIdResponse',
    'CreateSDKTask' => 'CreateSDKTask',
    'CreateSDKTaskResponse' => 'CreateSDKTaskResponse',
    'GetDataWFFileList' => 'GetDataWFFileList',
    'GetDataWFFileListResponse' => 'GetDataWFFileListResponse',
    'GetUsersListByGroup' => 'GetUsersListByGroup',
    'GetUsersListByGroupResponse' => 'GetUsersListByGroupResponse',
    'ModifyDataWA' => 'ModifyDataWA',
    'ModifyDataWAResponse' => 'ModifyDataWAResponse',
    'InsertFileWA' => 'InsertFileWA',
    'InsertFileWAResponse' => 'InsertFileWAResponse',
    'ChangeSDKTaskStatus' => 'ChangeSDKTaskStatus',
    'ChangeSDKTaskStatusResponse' => 'ChangeSDKTaskStatusResponse',
    'GetDataFileDetail' => 'GetDataFileDetail',
    'GetDataFileDetailResponse' => 'GetDataFileDetailResponse',
    'CanInsertFile' => 'CanInsertFile',
    'CanInsertFileResponse' => 'CanInsertFileResponse',
    'GetDefaultProcess' => 'GetDefaultProcess',
    'GetDefaultProcessResponse' => 'GetDefaultProcessResponse',
    'GetClasseDocumentale' => 'GetClasseDocumentale',
    'GetClasseDocumentaleResponse' => 'GetClasseDocumentaleResponse',
    'UploadPreviewFile' => 'UploadPreviewFile',
    'UploadPreviewFileResponse' => 'UploadPreviewFileResponse',
    'InsertTPFile' => 'InsertTPFile',
    'InsertTPFileResponse' => 'InsertTPFileResponse',
    'Combo_modify' => 'Combo_modify',
    'Combo_modifyResponse' => 'Combo_modifyResponse',
    'GetWorkflowVariables' => 'GetWorkflowVariables',
    'GetWorkflowVariablesResponse' => 'GetWorkflowVariablesResponse',
    'DeleteWFFileById' => 'DeleteWFFileById',
    'DeleteWFFileByIdResponse' => 'DeleteWFFileByIdResponse',
    'CanInsertData' => 'CanInsertData',
    'CanInsertDataResponse' => 'CanInsertDataResponse',
    'VerifySDKTaskNameExists' => 'VerifySDKTaskNameExists',
    'VerifySDKTaskNameExistsResponse' => 'VerifySDKTaskNameExistsResponse',
    'ModifySchedulerTaskSchedule' => 'ModifySchedulerTaskSchedule',
    'ModifySchedulerTaskScheduleResponse' => 'ModifySchedulerTaskScheduleResponse',
    'ModifyArchSostRule' => 'ModifyArchSostRule',
    'ModifyArchSostRuleResponse' => 'ModifyArchSostRuleResponse',
    'InsertDataWA' => 'InsertDataWA',
    'InsertDataWAResponse' => 'InsertDataWAResponse',
    'CanInsertProtocol' => 'CanInsertProtocol',
    'CanInsertProtocolResponse' => 'CanInsertProtocolResponse',
    'UploadUSEndFileWithUser' => 'UploadUSEndFileWithUser',
    'UploadUSEndFileWithUserResponse' => 'UploadUSEndFileWithUserResponse',
    'ModExpression' => 'ModExpression',
    'ModExpressionResponse' => 'ModExpressionResponse',
    'InsertWFFile' => 'InsertWFFile',
    'InsertWFFileResponse' => 'InsertWFFileResponse',
    'ResetUserSessions' => 'ResetUserSessions',
    'ResetUserSessionsResponse' => 'ResetUserSessionsResponse',
    'CanInsertLinkContainerToDocument' => 'CanInsertLinkContainerToDocument',
    'CanInsertLinkContainerToDocumentResponse' => 'CanInsertLinkContainerToDocumentResponse',
    'SetTmpDownloadPath' => 'SetTmpDownloadPath',
    'SetTmpDownloadPathResponse' => 'SetTmpDownloadPathResponse',
    'GetSDKTaskWatchFolder' => 'GetSDKTaskWatchFolder',
    'GetSDKTaskWatchFolderResponse' => 'GetSDKTaskWatchFolderResponse',
    'GetDownloadDetailByData' => 'GetDownloadDetailByData',
    'GetDownloadDetailByDataResponse' => 'GetDownloadDetailByDataResponse',
    'ModifySDKTaskWatchFolder' => 'ModifySDKTaskWatchFolder',
    'ModifySDKTaskWatchFolderResponse' => 'ModifySDKTaskWatchFolderResponse',
    'GetProtocolByDesc' => 'GetProtocolByDesc',
    'GetProtocolByDescResponse' => 'GetProtocolByDescResponse',
    'DeleteLink' => 'DeleteLink',
    'DeleteLinkResponse' => 'DeleteLinkResponse',
    'InsertTranslation' => 'InsertTranslation',
    'InsertTranslationResponse' => 'InsertTranslationResponse',
    'UploadSendChunk' => 'UploadSendChunk',
    'UploadSendChunkResponse' => 'UploadSendChunkResponse',
    'GetCountLinksToDocument' => 'GetCountLinksToDocument',
    'GetCountLinksToDocumentResponse' => 'GetCountLinksToDocumentResponse',
    'CreateTemplate' => 'CreateTemplate',
    'CreateTemplateResponse' => 'CreateTemplateResponse',
    'DestroyContainer' => 'DestroyContainer',
    'DestroyContainerResponse' => 'DestroyContainerResponse',
    'RemoveUserByGroup' => 'RemoveUserByGroup',
    'RemoveUserByGroupResponse' => 'RemoveUserByGroupResponse',
    'GetCountFileList' => 'GetCountFileList',
    'GetCountFileListResponse' => 'GetCountFileListResponse',
    'GetDataTPFileListByDocument' => 'GetDataTPFileListByDocument',
    'GetDataTPFileListByDocumentResponse' => 'GetDataTPFileListByDocumentResponse',
    'DownloadFile' => 'DownloadFile',
    'DownloadFileResponse' => 'DownloadFileResponse',
    'DownloadFileContainerUnc' => 'DownloadFileContainerUnc',
    'DownloadFileContainerUncResponse' => 'DownloadFileContainerUncResponse',
    'CanDeleteProtocol' => 'CanDeleteProtocol',
    'CanDeleteProtocolResponse' => 'CanDeleteProtocolResponse',
    'canCreateDynorg' => 'canCreateDynorg',
    'canCreateDynorgResponse' => 'canCreateDynorgResponse',
    'InsertSchedulerTask' => 'InsertSchedulerTask',
    'abxArchSostDocumentList' => 'abxArchSostDocumentList',
    'abxArchSostDocument' => 'abxArchSostDocument',
    'InsertSchedulerTaskResponse' => 'InsertSchedulerTaskResponse',
    'CreateField' => 'CreateField',
    'CreateFieldResponse' => 'CreateFieldResponse',
    'DownloadFileWA' => 'DownloadFileWA',
    'DownloadFileWAResponse' => 'DownloadFileWAResponse',
    'GetDataTPFileListByUsername' => 'GetDataTPFileListByUsername',
    'GetDataTPFileListByUsernameResponse' => 'GetDataTPFileListByUsernameResponse',
    'DownloadFileUnc' => 'DownloadFileUnc',
    'DownloadFileUncResponse' => 'DownloadFileUncResponse',
    'SaveChars' => 'SaveChars',
    'SaveCharsResponse' => 'SaveCharsResponse',
    'GetUserSettings' => 'GetUserSettings',
    'GetUserSettingsResponse' => 'GetUserSettingsResponse',
    'StartSDKTask' => 'StartSDKTask',
    'Fk_getAllRecord' => 'Fk_getAllRecord',
    'Fk_getAllRecordResponse' => 'Fk_getAllRecordResponse',
    'DeleteContainer' => 'DeleteContainer',
    'DeleteContainerResponse' => 'DeleteContainerResponse',
    'DeleteFileVersion' => 'DeleteFileVersion',
    'DeleteFileVersionResponse' => 'DeleteFileVersionResponse',
    'CanModifyFile' => 'CanModifyFile',
    'CanModifyFileResponse' => 'CanModifyFileResponse',
    'DelUserSettings' => 'DelUserSettings',
    'DelUserSettingsResponse' => 'DelUserSettingsResponse',
    'CheckIn_document' => 'CheckIn_document',
    'CheckIn_documentResponse' => 'CheckIn_documentResponse',
    'SetTmpWFDownloadPath' => 'SetTmpWFDownloadPath',
    'SetTmpWFDownloadPathResponse' => 'SetTmpWFDownloadPathResponse',
    'ShowProtocol' => 'ShowProtocol',
    'ShowProtocolResponse' => 'ShowProtocolResponse',
    'DeleteData' => 'DeleteData',
    'DeleteDataResponse' => 'DeleteDataResponse',
    'StoreSDKVariable' => 'StoreSDKVariable',
    'StoreSDKVariableResponse' => 'StoreSDKVariableResponse',
    'GetObject' => 'GetObject',
    'GetObjectResponse' => 'GetObjectResponse',
    'abxGoResult' => 'abxGoResult',
    'abxObjDef' => 'abxObjDef',
    'elobj' => 'elobj',
    'methods' => 'methods',
    'AddUser' => 'AddUser',
    'AddUserResponse' => 'AddUserResponse',
    'CheckIn_attachContainer' => 'CheckIn_attachContainer',
    'CheckIn_attachContainerResponse' => 'CheckIn_attachContainerResponse',
    'GetTemplateProperties' => 'GetTemplateProperties',
    'GetTemplatePropertiesResponse' => 'GetTemplatePropertiesResponse',
    'GetDataWFFileDetail' => 'GetDataWFFileDetail',
    'GetDataWFFileDetailResponse' => 'GetDataWFFileDetailResponse',
    'GetAllObjectWithSystem' => 'GetAllObjectWithSystem',
    'GetAllObjectWithSystemResponse' => 'GetAllObjectWithSystemResponse',
    'GetInstanceReplication' => 'GetInstanceReplication',
    'GetInstanceReplicationResponse' => 'GetInstanceReplicationResponse',
    'DeleteFileWA' => 'DeleteFileWA',
    'DeleteFileWAResponse' => 'DeleteFileWAResponse',
    'DeleteFileContainerVersion' => 'DeleteFileContainerVersion',
    'DeleteFileContainerVersionResponse' => 'DeleteFileContainerVersionResponse',
    'InsertFile' => 'InsertFile',
    'InsertFileResponse' => 'InsertFileResponse',
    'abxDynamicorgRuleList' => 'abxDynamicorgRuleList',
    'abxDynamicorgRule' => 'abxDynamicorgRule',
    'abxDynamicorgRuleElement' => 'abxDynamicorgRuleElement',
    'abxDynamicRuleResult' => 'abxDynamicRuleResult',
    'abxDynorgTypeResult' => 'abxDynorgTypeResult',
    'abxDynamicorgTypeList' => 'abxDynamicorgTypeList',
    'abxDynorgRuleType' => 'abxDynorgRuleType');

  /**
   * 
   * @param array $config A array of config values
   * @param string $wsdl The wsdl file to use
   * @access public
   */
  public function __construct(array $options = array(), $wsdl = 'http://iabx000002.iabx.net/abxWsGestService/abxWsGest?wsdl')
  {
    foreach(self::$classmap as $key => $value)
    {
      if(!isset($options['classmap'][$key]))
      {
        $options['classmap'][$key] = $value;
      }
    }
    
    if (isset($options['features']) == false)
    {
      $options['features'] = SOAP_SINGLE_ELEMENT_ARRAYS;
    }
  
    parent::__construct($wsdl, $options);
  }

  /**
   * 
   * @param GetWsdlVersion $parameters
   * @access public
   */
  public function GetWsdlVersion(GetWsdlVersion $parameters)
  {
    return $this->__soapCall('GetWsdlVersion', array($parameters));
  }

  /**
   * 
   * @param Fk_getColumnsName $parameters
   * @access public
   */
  public function Fk_getColumnsName(Fk_getColumnsName $parameters)
  {
    return $this->__soapCall('Fk_getColumnsName', array($parameters));
  }

  /**
   * 
   * @param Fk_getRemoteDatabaseList $parameters
   * @access public
   */
  public function Fk_getRemoteDatabaseList(Fk_getRemoteDatabaseList $parameters)
  {
    return $this->__soapCall('Fk_getRemoteDatabaseList', array($parameters));
  }

  /**
   * 
   * @param Fk_getRemoteTableList $parameters
   * @access public
   */
  public function Fk_getRemoteTableList(Fk_getRemoteTableList $parameters)
  {
    return $this->__soapCall('Fk_getRemoteTableList', array($parameters));
  }

  /**
   * 
   * @param Fk_getRemoteViewList $parameters
   * @access public
   */
  public function Fk_getRemoteViewList(Fk_getRemoteViewList $parameters)
  {
    return $this->__soapCall('Fk_getRemoteViewList', array($parameters));
  }

  /**
   * 
   * @param Fk_getRemoteFieldList $parameters
   * @access public
   */
  public function Fk_getRemoteFieldList(Fk_getRemoteFieldList $parameters)
  {
    return $this->__soapCall('Fk_getRemoteFieldList', array($parameters));
  }

  /**
   * 
   * @param Fk_getLocalFieldList $parameters
   * @access public
   */
  public function Fk_getLocalFieldList(Fk_getLocalFieldList $parameters)
  {
    return $this->__soapCall('Fk_getLocalFieldList', array($parameters));
  }

  /**
   * 
   * @param Query $parameters
   * @access public
   */
  public function Query(Query $parameters)
  {
    return $this->__soapCall('Query', array($parameters));
  }

  /**
   * 
   * @param Fk_getAllRecord $parameters
   * @access public
   */
  public function Fk_getAllRecord(Fk_getAllRecord $parameters)
  {
    return $this->__soapCall('Fk_getAllRecord', array($parameters));
  }

  /**
   * 
   * @param Fk_getCountAllRecord $parameters
   * @access public
   */
  public function Fk_getCountAllRecord(Fk_getCountAllRecord $parameters)
  {
    return $this->__soapCall('Fk_getCountAllRecord', array($parameters));
  }

  /**
   * 
   * @param Fk_getAllRecordByIndex $parameters
   * @access public
   */
  public function Fk_getAllRecordByIndex(Fk_getAllRecordByIndex $parameters)
  {
    return $this->__soapCall('Fk_getAllRecordByIndex', array($parameters));
  }

  /**
   * 
   * @param Fk_getAllRecordByDesc $parameters
   * @access public
   */
  public function Fk_getAllRecordByDesc(Fk_getAllRecordByDesc $parameters)
  {
    return $this->__soapCall('Fk_getAllRecordByDesc', array($parameters));
  }

  /**
   * 
   * @param Fk_getCountAllRecordByDesc $parameters
   * @access public
   */
  public function Fk_getCountAllRecordByDesc(Fk_getCountAllRecordByDesc $parameters)
  {
    return $this->__soapCall('Fk_getCountAllRecordByDesc', array($parameters));
  }

  /**
   * 
   * @param Fk_getCountAllRecordByIndexDesc $parameters
   * @access public
   */
  public function Fk_getCountAllRecordByIndexDesc(Fk_getCountAllRecordByIndexDesc $parameters)
  {
    return $this->__soapCall('Fk_getCountAllRecordByIndexDesc', array($parameters));
  }

  /**
   * 
   * @param Fk_getAllRecordByIndexDesc $parameters
   * @access public
   */
  public function Fk_getAllRecordByIndexDesc(Fk_getAllRecordByIndexDesc $parameters)
  {
    return $this->__soapCall('Fk_getAllRecordByIndexDesc', array($parameters));
  }

  /**
   * 
   * @param InsertDataWA $parameters
   * @access public
   */
  public function InsertDataWA(InsertDataWA $parameters)
  {
    return $this->__soapCall('InsertDataWA', array($parameters));
  }

  /**
   * 
   * @param GetListDataWA $parameters
   * @access public
   */
  public function GetListDataWA(GetListDataWA $parameters)
  {
    return $this->__soapCall('GetListDataWA', array($parameters));
  }

  /**
   * 
   * @param ModifyDataWA $parameters
   * @access public
   */
  public function ModifyDataWA(ModifyDataWA $parameters)
  {
    return $this->__soapCall('ModifyDataWA', array($parameters));
  }

  /**
   * 
   * @param DeleteDataWA $parameters
   * @access public
   */
  public function DeleteDataWA(DeleteDataWA $parameters)
  {
    return $this->__soapCall('DeleteDataWA', array($parameters));
  }

  /**
   * 
   * @param GetDataWAById $parameters
   * @access public
   */
  public function GetDataWAById(GetDataWAById $parameters)
  {
    return $this->__soapCall('GetDataWAById', array($parameters));
  }

  /**
   * 
   * @param InsertFileWA $parameters
   * @access public
   */
  public function InsertFileWA(InsertFileWA $parameters)
  {
    return $this->__soapCall('InsertFileWA', array($parameters));
  }

  /**
   * 
   * @param UploadSendChunkWA $parameters
   * @access public
   */
  public function UploadSendChunkWA(UploadSendChunkWA $parameters)
  {
    return $this->__soapCall('UploadSendChunkWA', array($parameters));
  }

  /**
   * 
   * @param UploadEndFileWA $parameters
   * @access public
   */
  public function UploadEndFileWA(UploadEndFileWA $parameters)
  {
    return $this->__soapCall('UploadEndFileWA', array($parameters));
  }

  /**
   * 
   * @param GetDataFileListWA $parameters
   * @access public
   */
  public function GetDataFileListWA(GetDataFileListWA $parameters)
  {
    return $this->__soapCall('GetDataFileListWA', array($parameters));
  }

  /**
   * 
   * @param DownloadFileWAByFileUniqueCode $parameters
   * @access public
   */
  public function DownloadFileWAByFileUniqueCode(DownloadFileWAByFileUniqueCode $parameters)
  {
    return $this->__soapCall('DownloadFileWAByFileUniqueCode', array($parameters));
  }

  /**
   * 
   * @param DownloadFileWA $parameters
   * @access public
   */
  public function DownloadFileWA(DownloadFileWA $parameters)
  {
    return $this->__soapCall('DownloadFileWA', array($parameters));
  }

  /**
   * 
   * @param DownloadGetNextWA $parameters
   * @access public
   */
  public function DownloadGetNextWA(DownloadGetNextWA $parameters)
  {
    return $this->__soapCall('DownloadGetNextWA', array($parameters));
  }

  /**
   * 
   * @param DownloadEndFileWA $parameters
   * @access public
   */
  public function DownloadEndFileWA(DownloadEndFileWA $parameters)
  {
    return $this->__soapCall('DownloadEndFileWA', array($parameters));
  }

  /**
   * 
   * @param DeleteFileWA $parameters
   * @access public
   */
  public function DeleteFileWA(DeleteFileWA $parameters)
  {
    return $this->__soapCall('DeleteFileWA', array($parameters));
  }

  /**
   * 
   * @param GetCountDocumentLinks $parameters
   * @access public
   */
  public function GetCountDocumentLinks(GetCountDocumentLinks $parameters)
  {
    return $this->__soapCall('GetCountDocumentLinks', array($parameters));
  }

  /**
   * 
   * @param SetInstanceReplication $parameters
   * @access public
   */
  public function SetInstanceReplication(SetInstanceReplication $parameters)
  {
    return $this->__soapCall('SetInstanceReplication', array($parameters));
  }

  /**
   * 
   * @param ModifyContainer $parameters
   * @access public
   */
  public function ModifyContainer(ModifyContainer $parameters)
  {
    return $this->__soapCall('ModifyContainer', array($parameters));
  }

  /**
   * 
   * @param ModifyTemplate $parameters
   * @access public
   */
  public function ModifyTemplate(ModifyTemplate $parameters)
  {
    return $this->__soapCall('ModifyTemplate', array($parameters));
  }

  /**
   * 
   * @param DeleteTemplate $parameters
   * @access public
   */
  public function DeleteTemplate(DeleteTemplate $parameters)
  {
    return $this->__soapCall('DeleteTemplate', array($parameters));
  }

  /**
   * 
   * @param DeleteContainer $parameters
   * @access public
   */
  public function DeleteContainer(DeleteContainer $parameters)
  {
    return $this->__soapCall('DeleteContainer', array($parameters));
  }

  /**
   * 
   * @param canModifyContainer $parameters
   * @access public
   */
  public function canModifyContainer(canModifyContainer $parameters)
  {
    return $this->__soapCall('canModifyContainer', array($parameters));
  }

  /**
   * 
   * @param canModifyTemplate $parameters
   * @access public
   */
  public function canModifyTemplate(canModifyTemplate $parameters)
  {
    return $this->__soapCall('canModifyTemplate', array($parameters));
  }

  /**
   * 
   * @param canDeleteContainer $parameters
   * @access public
   */
  public function canDeleteContainer(canDeleteContainer $parameters)
  {
    return $this->__soapCall('canDeleteContainer', array($parameters));
  }

  /**
   * 
   * @param canDeleteTemplate $parameters
   * @access public
   */
  public function canDeleteTemplate(canDeleteTemplate $parameters)
  {
    return $this->__soapCall('canDeleteTemplate', array($parameters));
  }

  /**
   * 
   * @param canCreateContainer $parameters
   * @access public
   */
  public function canCreateContainer(canCreateContainer $parameters)
  {
    return $this->__soapCall('canCreateContainer', array($parameters));
  }

  /**
   * 
   * @param canCreateTemplate $parameters
   * @access public
   */
  public function canCreateTemplate(canCreateTemplate $parameters)
  {
    return $this->__soapCall('canCreateTemplate', array($parameters));
  }

  /**
   * 
   * @param GetDynorgList $parameters
   * @access public
   */
  public function GetDynorgList(GetDynorgList $parameters)
  {
    return $this->__soapCall('GetDynorgList', array($parameters));
  }

  /**
   * 
   * @param ModifyDynorg $parameters
   * @access public
   */
  public function ModifyDynorg(ModifyDynorg $parameters)
  {
    return $this->__soapCall('ModifyDynorg', array($parameters));
  }

  /**
   * 
   * @param DeleteDynorg $parameters
   * @access public
   */
  public function DeleteDynorg(DeleteDynorg $parameters)
  {
    return $this->__soapCall('DeleteDynorg', array($parameters));
  }

  /**
   * 
   * @param GetArchiBoxInDomainByMatricola $parameters
   * @access public
   */
  public function GetArchiBoxInDomainByMatricola(GetArchiBoxInDomainByMatricola $parameters)
  {
    return $this->__soapCall('GetArchiBoxInDomainByMatricola', array($parameters));
  }

  /**
   * 
   * @param GetArchiBoxInfo $parameters
   * @access public
   */
  public function GetArchiBoxInfo(GetArchiBoxInfo $parameters)
  {
    return $this->__soapCall('GetArchiBoxInfo', array($parameters));
  }

  /**
   * 
   * @param GetArchiBoxInDomain $parameters
   * @access public
   */
  public function GetArchiBoxInDomain(GetArchiBoxInDomain $parameters)
  {
    return $this->__soapCall('GetArchiBoxInDomain', array($parameters));
  }

  /**
   * 
   * @param DigitalSign $parameters
   * @access public
   */
  public function DigitalSign(DigitalSign $parameters)
  {
    return $this->__soapCall('DigitalSign', array($parameters));
  }

  /**
   * 
   * @param GetInstanceReplicationStatus $parameters
   * @access public
   */
  public function GetInstanceReplicationStatus(GetInstanceReplicationStatus $parameters)
  {
    return $this->__soapCall('GetInstanceReplicationStatus', array($parameters));
  }

  /**
   * 
   * @param CreateContainer $parameters
   * @access public
   */
  public function CreateContainer(CreateContainer $parameters)
  {
    return $this->__soapCall('CreateContainer', array($parameters));
  }

  /**
   * 
   * @param CreateTemplate $parameters
   * @access public
   */
  public function CreateTemplate(CreateTemplate $parameters)
  {
    return $this->__soapCall('CreateTemplate', array($parameters));
  }

  /**
   * 
   * @param CreateDynorg $parameters
   * @access public
   */
  public function CreateDynorg(CreateDynorg $parameters)
  {
    return $this->__soapCall('CreateDynorg', array($parameters));
  }

  /**
   * 
   * @param GetFieldList $parameters
   * @access public
   */
  public function GetFieldList(GetFieldList $parameters)
  {
    return $this->__soapCall('GetFieldList', array($parameters));
  }

  /**
   * 
   * @param GetFieldProperties $parameters
   * @access public
   */
  public function GetFieldProperties(GetFieldProperties $parameters)
  {
    return $this->__soapCall('GetFieldProperties', array($parameters));
  }

  /**
   * 
   * @param GetFieldsPropertiesFromTemplate $parameters
   * @access public
   */
  public function GetFieldsPropertiesFromTemplate(GetFieldsPropertiesFromTemplate $parameters)
  {
    return $this->__soapCall('GetFieldsPropertiesFromTemplate', array($parameters));
  }

  /**
   * 
   * @param GetAdjacentArchiBox $parameters
   * @access public
   */
  public function GetAdjacentArchiBox(GetAdjacentArchiBox $parameters)
  {
    return $this->__soapCall('GetAdjacentArchiBox', array($parameters));
  }

  /**
   * 
   * @param GetInstanceReplication $parameters
   * @access public
   */
  public function GetInstanceReplication(GetInstanceReplication $parameters)
  {
    return $this->__soapCall('GetInstanceReplication', array($parameters));
  }

  /**
   * 
   * @param Login $parameters
   * @access public
   */
  public function Login(Login $parameters)
  {
    return $this->__soapCall('Login', array($parameters));
  }

  /**
   * 
   * @param Logout $parameters
   * @access public
   */
  public function Logout(Logout $parameters)
  {
    return $this->__soapCall('Logout', array($parameters));
  }

  /**
   * 
   * @param InsertSchedulerTask $parameters
   * @access public
   */
  public function InsertSchedulerTask(InsertSchedulerTask $parameters)
  {
    return $this->__soapCall('InsertSchedulerTask', array($parameters));
  }

  /**
   * 
   * @param GetSchedulerTasks $parameters
   * @access public
   */
  public function GetSchedulerTasks(GetSchedulerTasks $parameters)
  {
    return $this->__soapCall('GetSchedulerTasks', array($parameters));
  }

  /**
   * 
   * @param DeleteSchedulerTask $parameters
   * @access public
   */
  public function DeleteSchedulerTask(DeleteSchedulerTask $parameters)
  {
    return $this->__soapCall('DeleteSchedulerTask', array($parameters));
  }

  /**
   * 
   * @param GetSchedulerTasksToRun $parameters
   * @access public
   */
  public function GetSchedulerTasksToRun(GetSchedulerTasksToRun $parameters)
  {
    return $this->__soapCall('GetSchedulerTasksToRun', array($parameters));
  }

  /**
   * 
   * @param SchedulerTaskScheduleProcessed $parameters
   * @access public
   */
  public function SchedulerTaskScheduleProcessed(SchedulerTaskScheduleProcessed $parameters)
  {
    return $this->__soapCall('SchedulerTaskScheduleProcessed', array($parameters));
  }

  /**
   * 
   * @param ModifySchedulerTaskSchedule $parameters
   * @access public
   */
  public function ModifySchedulerTaskSchedule(ModifySchedulerTaskSchedule $parameters)
  {
    return $this->__soapCall('ModifySchedulerTaskSchedule', array($parameters));
  }

  /**
   * 
   * @param DeleteSchedulerTaskSchedule $parameters
   * @access public
   */
  public function DeleteSchedulerTaskSchedule(DeleteSchedulerTaskSchedule $parameters)
  {
    return $this->__soapCall('DeleteSchedulerTaskSchedule', array($parameters));
  }

  /**
   * 
   * @param ChangeSchedulerTaskScheduleStatus $parameters
   * @access public
   */
  public function ChangeSchedulerTaskScheduleStatus(ChangeSchedulerTaskScheduleStatus $parameters)
  {
    return $this->__soapCall('ChangeSchedulerTaskScheduleStatus', array($parameters));
  }

  /**
   * 
   * @param ModifyField $parameters
   * @access public
   */
  public function ModifyField(ModifyField $parameters)
  {
    return $this->__soapCall('ModifyField', array($parameters));
  }

  /**
   * 
   * @param DeleteField $parameters
   * @access public
   */
  public function DeleteField(DeleteField $parameters)
  {
    return $this->__soapCall('DeleteField', array($parameters));
  }

  /**
   * 
   * @param CreateField $parameters
   * @access public
   */
  public function CreateField(CreateField $parameters)
  {
    return $this->__soapCall('CreateField', array($parameters));
  }

  /**
   * 
   * @param canModifyField $parameters
   * @access public
   */
  public function canModifyField(canModifyField $parameters)
  {
    return $this->__soapCall('canModifyField', array($parameters));
  }

  /**
   * 
   * @param canDeleteField $parameters
   * @access public
   */
  public function canDeleteField(canDeleteField $parameters)
  {
    return $this->__soapCall('canDeleteField', array($parameters));
  }

  /**
   * 
   * @param canCreateField $parameters
   * @access public
   */
  public function canCreateField(canCreateField $parameters)
  {
    return $this->__soapCall('canCreateField', array($parameters));
  }

  /**
   * 
   * @param CanDeleteLinkFromContainer $parameters
   * @access public
   */
  public function CanDeleteLinkFromContainer(CanDeleteLinkFromContainer $parameters)
  {
    return $this->__soapCall('CanDeleteLinkFromContainer', array($parameters));
  }

  /**
   * 
   * @param GetDomainList $parameters
   * @access public
   */
  public function GetDomainList(GetDomainList $parameters)
  {
    return $this->__soapCall('GetDomainList', array($parameters));
  }

  /**
   * 
   * @param InsertLinkContainerToContainer $parameters
   * @access public
   */
  public function InsertLinkContainerToContainer(InsertLinkContainerToContainer $parameters)
  {
    return $this->__soapCall('InsertLinkContainerToContainer', array($parameters));
  }

  /**
   * 
   * @param CanInsertLinkContainerToContainer $parameters
   * @access public
   */
  public function CanInsertLinkContainerToContainer(CanInsertLinkContainerToContainer $parameters)
  {
    return $this->__soapCall('CanInsertLinkContainerToContainer', array($parameters));
  }

  /**
   * 
   * @param InsertLinkContainerToDocument $parameters
   * @access public
   */
  public function InsertLinkContainerToDocument(InsertLinkContainerToDocument $parameters)
  {
    return $this->__soapCall('InsertLinkContainerToDocument', array($parameters));
  }

  /**
   * 
   * @param CanInsertLinkContainerToDocument $parameters
   * @access public
   */
  public function CanInsertLinkContainerToDocument(CanInsertLinkContainerToDocument $parameters)
  {
    return $this->__soapCall('CanInsertLinkContainerToDocument', array($parameters));
  }

  /**
   * 
   * @param InsertLinkDocumentToDocument $parameters
   * @access public
   */
  public function InsertLinkDocumentToDocument(InsertLinkDocumentToDocument $parameters)
  {
    return $this->__soapCall('InsertLinkDocumentToDocument', array($parameters));
  }

  /**
   * 
   * @param CanInsertLinkDocumentToDocument $parameters
   * @access public
   */
  public function CanInsertLinkDocumentToDocument(CanInsertLinkDocumentToDocument $parameters)
  {
    return $this->__soapCall('CanInsertLinkDocumentToDocument', array($parameters));
  }

  /**
   * 
   * @param ModifyLinkContainerToContainer $parameters
   * @access public
   */
  public function ModifyLinkContainerToContainer(ModifyLinkContainerToContainer $parameters)
  {
    return $this->__soapCall('ModifyLinkContainerToContainer', array($parameters));
  }

  /**
   * 
   * @param CanModifyLinkContainerToContainer $parameters
   * @access public
   */
  public function CanModifyLinkContainerToContainer(CanModifyLinkContainerToContainer $parameters)
  {
    return $this->__soapCall('CanModifyLinkContainerToContainer', array($parameters));
  }

  /**
   * 
   * @param ModifyLinkContainerToDocument $parameters
   * @access public
   */
  public function ModifyLinkContainerToDocument(ModifyLinkContainerToDocument $parameters)
  {
    return $this->__soapCall('ModifyLinkContainerToDocument', array($parameters));
  }

  /**
   * 
   * @param CanModifyLinkContainerToDocument $parameters
   * @access public
   */
  public function CanModifyLinkContainerToDocument(CanModifyLinkContainerToDocument $parameters)
  {
    return $this->__soapCall('CanModifyLinkContainerToDocument', array($parameters));
  }

  /**
   * 
   * @param DeleteLink $parameters
   * @access public
   */
  public function DeleteLink(DeleteLink $parameters)
  {
    return $this->__soapCall('DeleteLink', array($parameters));
  }

  /**
   * 
   * @param GetDocumentLinks $parameters
   * @access public
   */
  public function GetDocumentLinks(GetDocumentLinks $parameters)
  {
    return $this->__soapCall('GetDocumentLinks', array($parameters));
  }

  /**
   * 
   * @param GetCountLinksToDocument $parameters
   * @access public
   */
  public function GetCountLinksToDocument(GetCountLinksToDocument $parameters)
  {
    return $this->__soapCall('GetCountLinksToDocument', array($parameters));
  }

  /**
   * 
   * @param GetLinksToDocument $parameters
   * @access public
   */
  public function GetLinksToDocument(GetLinksToDocument $parameters)
  {
    return $this->__soapCall('GetLinksToDocument', array($parameters));
  }

  /**
   * 
   * @param GetInstanceNameFromLinks $parameters
   * @access public
   */
  public function GetInstanceNameFromLinks(GetInstanceNameFromLinks $parameters)
  {
    return $this->__soapCall('GetInstanceNameFromLinks', array($parameters));
  }

  /**
   * 
   * @param GetContainerLinks $parameters
   * @access public
   */
  public function GetContainerLinks(GetContainerLinks $parameters)
  {
    return $this->__soapCall('GetContainerLinks', array($parameters));
  }

  /**
   * 
   * @param RegenerateDynOrg $parameters
   * @access public
   */
  public function RegenerateDynOrg(RegenerateDynOrg $parameters)
  {
    return $this->__soapCall('RegenerateDynOrg', array($parameters));
  }

  /**
   * 
   * @param GetDynorgTypeList $parameters
   * @access public
   */
  public function GetDynorgTypeList(GetDynorgTypeList $parameters)
  {
    return $this->__soapCall('GetDynorgTypeList', array($parameters));
  }

  /**
   * 
   * @param canModifyDynorg $parameters
   * @access public
   */
  public function canModifyDynorg(canModifyDynorg $parameters)
  {
    return $this->__soapCall('canModifyDynorg', array($parameters));
  }

  /**
   * 
   * @param canDeleteDynorg $parameters
   * @access public
   */
  public function canDeleteDynorg(canDeleteDynorg $parameters)
  {
    return $this->__soapCall('canDeleteDynorg', array($parameters));
  }

  /**
   * 
   * @param canCreateDynorg $parameters
   * @access public
   */
  public function canCreateDynorg(canCreateDynorg $parameters)
  {
    return $this->__soapCall('canCreateDynorg', array($parameters));
  }

  /**
   * 
   * @param GetClasseDocumentale $parameters
   * @access public
   */
  public function GetClasseDocumentale(GetClasseDocumentale $parameters)
  {
    return $this->__soapCall('GetClasseDocumentale', array($parameters));
  }

  /**
   * 
   * @param DeleteClasseDocumentale $parameters
   * @access public
   */
  public function DeleteClasseDocumentale(DeleteClasseDocumentale $parameters)
  {
    return $this->__soapCall('DeleteClasseDocumentale', array($parameters));
  }

  /**
   * 
   * @param InsertClasseDocumentale $parameters
   * @access public
   */
  public function InsertClasseDocumentale(InsertClasseDocumentale $parameters)
  {
    return $this->__soapCall('InsertClasseDocumentale', array($parameters));
  }

  /**
   * 
   * @param GetQueryParam $parameters
   * @access public
   */
  public function GetQueryParam(GetQueryParam $parameters)
  {
    return $this->__soapCall('GetQueryParam', array($parameters));
  }

  /**
   * 
   * @param QueryHeader $parameters
   * @access public
   */
  public function QueryHeader(QueryHeader $parameters)
  {
    return $this->__soapCall('QueryHeader', array($parameters));
  }

  /**
   * 
   * @param QueryTotAttach $parameters
   * @access public
   */
  public function QueryTotAttach(QueryTotAttach $parameters)
  {
    return $this->__soapCall('QueryTotAttach', array($parameters));
  }

  /**
   * 
   * @param DeleteFilter $parameters
   * @access public
   */
  public function DeleteFilter(DeleteFilter $parameters)
  {
    return $this->__soapCall('DeleteFilter', array($parameters));
  }

  /**
   * 
   * @param ModifyFilter $parameters
   * @access public
   */
  public function ModifyFilter(ModifyFilter $parameters)
  {
    return $this->__soapCall('ModifyFilter', array($parameters));
  }

  /**
   * 
   * @param InsertFilter $parameters
   * @access public
   */
  public function InsertFilter(InsertFilter $parameters)
  {
    return $this->__soapCall('InsertFilter', array($parameters));
  }

  /**
   * 
   * @param GetInstanceId $parameters
   * @access public
   */
  public function GetInstanceId(GetInstanceId $parameters)
  {
    return $this->__soapCall('GetInstanceId', array($parameters));
  }

  /**
   * 
   * @param GetTemplateProperties $parameters
   * @access public
   */
  public function GetTemplateProperties(GetTemplateProperties $parameters)
  {
    return $this->__soapCall('GetTemplateProperties', array($parameters));
  }

  /**
   * 
   * @param GetArchSostRules $parameters
   * @access public
   */
  public function GetArchSostRules(GetArchSostRules $parameters)
  {
    return $this->__soapCall('GetArchSostRules', array($parameters));
  }

  /**
   * 
   * @param InsertArchSostRule $parameters
   * @access public
   */
  public function InsertArchSostRule(InsertArchSostRule $parameters)
  {
    return $this->__soapCall('InsertArchSostRule', array($parameters));
  }

  /**
   * 
   * @param DeleteArchSostRule $parameters
   * @access public
   */
  public function DeleteArchSostRule(DeleteArchSostRule $parameters)
  {
    return $this->__soapCall('DeleteArchSostRule', array($parameters));
  }

  /**
   * 
   * @param ModifyArchSostRule $parameters
   * @access public
   */
  public function ModifyArchSostRule(ModifyArchSostRule $parameters)
  {
    return $this->__soapCall('ModifyArchSostRule', array($parameters));
  }

  /**
   * 
   * @param DestroyContainer $parameters
   * @access public
   */
  public function DestroyContainer(DestroyContainer $parameters)
  {
    return $this->__soapCall('DestroyContainer', array($parameters));
  }

  /**
   * 
   * @param GetRootId $parameters
   * @access public
   */
  public function GetRootId(GetRootId $parameters)
  {
    return $this->__soapCall('GetRootId', array($parameters));
  }

  /**
   * 
   * @param GetInstancePathname $parameters
   * @access public
   */
  public function GetInstancePathname(GetInstancePathname $parameters)
  {
    return $this->__soapCall('GetInstancePathname', array($parameters));
  }

  /**
   * 
   * @param GetObject $parameters
   * @access public
   */
  public function GetObject(GetObject $parameters)
  {
    return $this->__soapCall('GetObject', array($parameters));
  }

  /**
   * 
   * @param GetAllObjectWithSystem $parameters
   * @access public
   */
  public function GetAllObjectWithSystem(GetAllObjectWithSystem $parameters)
  {
    return $this->__soapCall('GetAllObjectWithSystem', array($parameters));
  }

  /**
   * 
   * @param GetMethod $parameters
   * @access public
   */
  public function GetMethod(GetMethod $parameters)
  {
    return $this->__soapCall('GetMethod', array($parameters));
  }

  /**
   * 
   * @param FullTreePathName $parameters
   * @access public
   */
  public function FullTreePathName(FullTreePathName $parameters)
  {
    return $this->__soapCall('FullTreePathName', array($parameters));
  }

  /**
   * 
   * @param GetTreeForSecurity $parameters
   * @access public
   */
  public function GetTreeForSecurity(GetTreeForSecurity $parameters)
  {
    return $this->__soapCall('GetTreeForSecurity', array($parameters));
  }

  /**
   * 
   * @param GetTree $parameters
   * @access public
   */
  public function GetTree(GetTree $parameters)
  {
    return $this->__soapCall('GetTree', array($parameters));
  }

  /**
   * 
   * @param CreateRaccoglitore $parameters
   * @access public
   */
  public function CreateRaccoglitore(CreateRaccoglitore $parameters)
  {
    return $this->__soapCall('CreateRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param DeleteRaccoglitore $parameters
   * @access public
   */
  public function DeleteRaccoglitore(DeleteRaccoglitore $parameters)
  {
    return $this->__soapCall('DeleteRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param DestroyRaccoglitore $parameters
   * @access public
   */
  public function DestroyRaccoglitore(DestroyRaccoglitore $parameters)
  {
    return $this->__soapCall('DestroyRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param ModifyRaccoglitore $parameters
   * @access public
   */
  public function ModifyRaccoglitore(ModifyRaccoglitore $parameters)
  {
    return $this->__soapCall('ModifyRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param canCreateRaccoglitore $parameters
   * @access public
   */
  public function canCreateRaccoglitore(canCreateRaccoglitore $parameters)
  {
    return $this->__soapCall('canCreateRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param canDeleteRaccoglitore $parameters
   * @access public
   */
  public function canDeleteRaccoglitore(canDeleteRaccoglitore $parameters)
  {
    return $this->__soapCall('canDeleteRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param canModifyRaccoglitore $parameters
   * @access public
   */
  public function canModifyRaccoglitore(canModifyRaccoglitore $parameters)
  {
    return $this->__soapCall('canModifyRaccoglitore', array($parameters));
  }

  /**
   * 
   * @param GetTemplateList $parameters
   * @access public
   */
  public function GetTemplateList(GetTemplateList $parameters)
  {
    return $this->__soapCall('GetTemplateList', array($parameters));
  }

  /**
   * 
   * @param GetLinksToDocumentFiltered $parameters
   * @access public
   */
  public function GetLinksToDocumentFiltered(GetLinksToDocumentFiltered $parameters)
  {
    return $this->__soapCall('GetLinksToDocumentFiltered', array($parameters));
  }

  /**
   * 
   * @param CheckIn_attach $parameters
   * @access public
   */
  public function CheckIn_attach(CheckIn_attach $parameters)
  {
    return $this->__soapCall('CheckIn_attach', array($parameters));
  }

  /**
   * 
   * @param CheckIn_attachContainer $parameters
   * @access public
   */
  public function CheckIn_attachContainer(CheckIn_attachContainer $parameters)
  {
    return $this->__soapCall('CheckIn_attachContainer', array($parameters));
  }

  /**
   * 
   * @param CheckIn_document $parameters
   * @access public
   */
  public function CheckIn_document(CheckIn_document $parameters)
  {
    return $this->__soapCall('CheckIn_document', array($parameters));
  }

  /**
   * 
   * @param CheckOut_attach $parameters
   * @access public
   */
  public function CheckOut_attach(CheckOut_attach $parameters)
  {
    return $this->__soapCall('CheckOut_attach', array($parameters));
  }

  /**
   * 
   * @param CheckOut_attachContainer $parameters
   * @access public
   */
  public function CheckOut_attachContainer(CheckOut_attachContainer $parameters)
  {
    return $this->__soapCall('CheckOut_attachContainer', array($parameters));
  }

  /**
   * 
   * @param CheckOut_document $parameters
   * @access public
   */
  public function CheckOut_document(CheckOut_document $parameters)
  {
    return $this->__soapCall('CheckOut_document', array($parameters));
  }

  /**
   * 
   * @param Combo_insert $parameters
   * @access public
   */
  public function Combo_insert(Combo_insert $parameters)
  {
    return $this->__soapCall('Combo_insert', array($parameters));
  }

  /**
   * 
   * @param Combo_removeItem $parameters
   * @access public
   */
  public function Combo_removeItem(Combo_removeItem $parameters)
  {
    return $this->__soapCall('Combo_removeItem', array($parameters));
  }

  /**
   * 
   * @param Combo_removeAll $parameters
   * @access public
   */
  public function Combo_removeAll(Combo_removeAll $parameters)
  {
    return $this->__soapCall('Combo_removeAll', array($parameters));
  }

  /**
   * 
   * @param Combo_getAll $parameters
   * @access public
   */
  public function Combo_getAll(Combo_getAll $parameters)
  {
    return $this->__soapCall('Combo_getAll', array($parameters));
  }

  /**
   * 
   * @param Combo_isCombo $parameters
   * @access public
   */
  public function Combo_isCombo(Combo_isCombo $parameters)
  {
    return $this->__soapCall('Combo_isCombo', array($parameters));
  }

  /**
   * 
   * @param Combo_modify $parameters
   * @access public
   */
  public function Combo_modify(Combo_modify $parameters)
  {
    return $this->__soapCall('Combo_modify', array($parameters));
  }

  /**
   * 
   * @param DeleteFile $parameters
   * @access public
   */
  public function DeleteFile(DeleteFile $parameters)
  {
    return $this->__soapCall('DeleteFile', array($parameters));
  }

  /**
   * 
   * @param DeleteFileContainer $parameters
   * @access public
   */
  public function DeleteFileContainer(DeleteFileContainer $parameters)
  {
    return $this->__soapCall('DeleteFileContainer', array($parameters));
  }

  /**
   * 
   * @param CanDeleteFile $parameters
   * @access public
   */
  public function CanDeleteFile(CanDeleteFile $parameters)
  {
    return $this->__soapCall('CanDeleteFile', array($parameters));
  }

  /**
   * 
   * @param CanDeleteFileContainer $parameters
   * @access public
   */
  public function CanDeleteFileContainer(CanDeleteFileContainer $parameters)
  {
    return $this->__soapCall('CanDeleteFileContainer', array($parameters));
  }

  /**
   * 
   * @param DeleteFileVersion $parameters
   * @access public
   */
  public function DeleteFileVersion(DeleteFileVersion $parameters)
  {
    return $this->__soapCall('DeleteFileVersion', array($parameters));
  }

  /**
   * 
   * @param DeleteFileContainerVersion $parameters
   * @access public
   */
  public function DeleteFileContainerVersion(DeleteFileContainerVersion $parameters)
  {
    return $this->__soapCall('DeleteFileContainerVersion', array($parameters));
  }

  /**
   * 
   * @param InsertFile $parameters
   * @access public
   */
  public function InsertFile(InsertFile $parameters)
  {
    return $this->__soapCall('InsertFile', array($parameters));
  }

  /**
   * 
   * @param InsertFileContainer $parameters
   * @access public
   */
  public function InsertFileContainer(InsertFileContainer $parameters)
  {
    return $this->__soapCall('InsertFileContainer', array($parameters));
  }

  /**
   * 
   * @param CanInsertFile $parameters
   * @access public
   */
  public function CanInsertFile(CanInsertFile $parameters)
  {
    return $this->__soapCall('CanInsertFile', array($parameters));
  }

  /**
   * 
   * @param CanInsertFileContainer $parameters
   * @access public
   */
  public function CanInsertFileContainer(CanInsertFileContainer $parameters)
  {
    return $this->__soapCall('CanInsertFileContainer', array($parameters));
  }

  /**
   * 
   * @param CanModifyFile $parameters
   * @access public
   */
  public function CanModifyFile(CanModifyFile $parameters)
  {
    return $this->__soapCall('CanModifyFile', array($parameters));
  }

  /**
   * 
   * @param CanShowFile $parameters
   * @access public
   */
  public function CanShowFile(CanShowFile $parameters)
  {
    return $this->__soapCall('CanShowFile', array($parameters));
  }

  /**
   * 
   * @param GetFileListByCode $parameters
   * @access public
   */
  public function GetFileListByCode(GetFileListByCode $parameters)
  {
    return $this->__soapCall('GetFileListByCode', array($parameters));
  }

  /**
   * 
   * @param GetFileListByCodeForSecurity $parameters
   * @access public
   */
  public function GetFileListByCodeForSecurity(GetFileListByCodeForSecurity $parameters)
  {
    return $this->__soapCall('GetFileListByCodeForSecurity', array($parameters));
  }

  /**
   * 
   * @param GetDataFileListContainer $parameters
   * @access public
   */
  public function GetDataFileListContainer(GetDataFileListContainer $parameters)
  {
    return $this->__soapCall('GetDataFileListContainer', array($parameters));
  }

  /**
   * 
   * @param GetDataFileListOnlyLastVersion $parameters
   * @access public
   */
  public function GetDataFileListOnlyLastVersion(GetDataFileListOnlyLastVersion $parameters)
  {
    return $this->__soapCall('GetDataFileListOnlyLastVersion', array($parameters));
  }

  /**
   * 
   * @param GetDataFileList $parameters
   * @access public
   */
  public function GetDataFileList(GetDataFileList $parameters)
  {
    return $this->__soapCall('GetDataFileList', array($parameters));
  }

  /**
   * 
   * @param GetDataFileListForSecurity $parameters
   * @access public
   */
  public function GetDataFileListForSecurity(GetDataFileListForSecurity $parameters)
  {
    return $this->__soapCall('GetDataFileListForSecurity', array($parameters));
  }

  /**
   * 
   * @param GetDataFileDetail $parameters
   * @access public
   */
  public function GetDataFileDetail(GetDataFileDetail $parameters)
  {
    return $this->__soapCall('GetDataFileDetail', array($parameters));
  }

  /**
   * 
   * @param GetDataFileContainerDetail $parameters
   * @access public
   */
  public function GetDataFileContainerDetail(GetDataFileContainerDetail $parameters)
  {
    return $this->__soapCall('GetDataFileContainerDetail', array($parameters));
  }

  /**
   * 
   * @param DownloadFile $parameters
   * @access public
   */
  public function DownloadFile(DownloadFile $parameters)
  {
    return $this->__soapCall('DownloadFile', array($parameters));
  }

  /**
   * 
   * @param DownloadFileByFileUniqueCode $parameters
   * @access public
   */
  public function DownloadFileByFileUniqueCode(DownloadFileByFileUniqueCode $parameters)
  {
    return $this->__soapCall('DownloadFileByFileUniqueCode', array($parameters));
  }

  /**
   * 
   * @param DownloadFileUnc $parameters
   * @access public
   */
  public function DownloadFileUnc(DownloadFileUnc $parameters)
  {
    return $this->__soapCall('DownloadFileUnc', array($parameters));
  }

  /**
   * 
   * @param DownloadFileContainerUnc $parameters
   * @access public
   */
  public function DownloadFileContainerUnc(DownloadFileContainerUnc $parameters)
  {
    return $this->__soapCall('DownloadFileContainerUnc', array($parameters));
  }

  /**
   * 
   * @param DownloadGetChunk $parameters
   * @access public
   */
  public function DownloadGetChunk(DownloadGetChunk $parameters)
  {
    return $this->__soapCall('DownloadGetChunk', array($parameters));
  }

  /**
   * 
   * @param DownloadGetNext $parameters
   * @access public
   */
  public function DownloadGetNext(DownloadGetNext $parameters)
  {
    return $this->__soapCall('DownloadGetNext', array($parameters));
  }

  /**
   * 
   * @param UploadSendChunk $parameters
   * @access public
   */
  public function UploadSendChunk(UploadSendChunk $parameters)
  {
    return $this->__soapCall('UploadSendChunk', array($parameters));
  }

  /**
   * 
   * @param DownloadFileContainer $parameters
   * @access public
   */
  public function DownloadFileContainer(DownloadFileContainer $parameters)
  {
    return $this->__soapCall('DownloadFileContainer', array($parameters));
  }

  /**
   * 
   * @param DownloadFilePreview $parameters
   * @access public
   */
  public function DownloadFilePreview(DownloadFilePreview $parameters)
  {
    return $this->__soapCall('DownloadFilePreview', array($parameters));
  }

  /**
   * 
   * @param GetUploadDetailByFilecode $parameters
   * @access public
   */
  public function GetUploadDetailByFilecode(GetUploadDetailByFilecode $parameters)
  {
    return $this->__soapCall('GetUploadDetailByFilecode', array($parameters));
  }

  /**
   * 
   * @param GetUploadDetailByDataId $parameters
   * @access public
   */
  public function GetUploadDetailByDataId(GetUploadDetailByDataId $parameters)
  {
    return $this->__soapCall('GetUploadDetailByDataId', array($parameters));
  }

  /**
   * 
   * @param GetUploadDetailByData $parameters
   * @access public
   */
  public function GetUploadDetailByData(GetUploadDetailByData $parameters)
  {
    return $this->__soapCall('GetUploadDetailByData', array($parameters));
  }

  /**
   * 
   * @param GetUploadDetailByContId $parameters
   * @access public
   */
  public function GetUploadDetailByContId(GetUploadDetailByContId $parameters)
  {
    return $this->__soapCall('GetUploadDetailByContId', array($parameters));
  }

  /**
   * 
   * @param GetUploadDetailByCont $parameters
   * @access public
   */
  public function GetUploadDetailByCont(GetUploadDetailByCont $parameters)
  {
    return $this->__soapCall('GetUploadDetailByCont', array($parameters));
  }

  /**
   * 
   * @param UploadEndFile $parameters
   * @access public
   */
  public function UploadEndFile(UploadEndFile $parameters)
  {
    return $this->__soapCall('UploadEndFile', array($parameters));
  }

  /**
   * 
   * @param UploadEndFileContainer $parameters
   * @access public
   */
  public function UploadEndFileContainer(UploadEndFileContainer $parameters)
  {
    return $this->__soapCall('UploadEndFileContainer', array($parameters));
  }

  /**
   * 
   * @param SetTmpUploadPath $parameters
   * @access public
   */
  public function SetTmpUploadPath(SetTmpUploadPath $parameters)
  {
    return $this->__soapCall('SetTmpUploadPath', array($parameters));
  }

  /**
   * 
   * @param SetTmpDownloadPath $parameters
   * @access public
   */
  public function SetTmpDownloadPath(SetTmpDownloadPath $parameters)
  {
    return $this->__soapCall('SetTmpDownloadPath', array($parameters));
  }

  /**
   * 
   * @param GetDownloadDetailByFilecode $parameters
   * @access public
   */
  public function GetDownloadDetailByFilecode(GetDownloadDetailByFilecode $parameters)
  {
    return $this->__soapCall('GetDownloadDetailByFilecode', array($parameters));
  }

  /**
   * 
   * @param GetDownloadDetailByDataId $parameters
   * @access public
   */
  public function GetDownloadDetailByDataId(GetDownloadDetailByDataId $parameters)
  {
    return $this->__soapCall('GetDownloadDetailByDataId', array($parameters));
  }

  /**
   * 
   * @param GetDownloadDetailByData $parameters
   * @access public
   */
  public function GetDownloadDetailByData(GetDownloadDetailByData $parameters)
  {
    return $this->__soapCall('GetDownloadDetailByData', array($parameters));
  }

  /**
   * 
   * @param GetDownloadDetailByContId $parameters
   * @access public
   */
  public function GetDownloadDetailByContId(GetDownloadDetailByContId $parameters)
  {
    return $this->__soapCall('GetDownloadDetailByContId', array($parameters));
  }

  /**
   * 
   * @param GetDownloadDetailByCont $parameters
   * @access public
   */
  public function GetDownloadDetailByCont(GetDownloadDetailByCont $parameters)
  {
    return $this->__soapCall('GetDownloadDetailByCont', array($parameters));
  }

  /**
   * 
   * @param GetCountFileList $parameters
   * @access public
   */
  public function GetCountFileList(GetCountFileList $parameters)
  {
    return $this->__soapCall('GetCountFileList', array($parameters));
  }

  /**
   * 
   * @param ModifyFileDescription $parameters
   * @access public
   */
  public function ModifyFileDescription(ModifyFileDescription $parameters)
  {
    return $this->__soapCall('ModifyFileDescription', array($parameters));
  }

  /**
   * 
   * @param CopyFile $parameters
   * @access public
   */
  public function CopyFile(CopyFile $parameters)
  {
    return $this->__soapCall('CopyFile', array($parameters));
  }

  /**
   * 
   * @param IfFileExist $parameters
   * @access public
   */
  public function IfFileExist(IfFileExist $parameters)
  {
    return $this->__soapCall('IfFileExist', array($parameters));
  }

  /**
   * 
   * @param SetFileAvailable $parameters
   * @access public
   */
  public function SetFileAvailable(SetFileAvailable $parameters)
  {
    return $this->__soapCall('SetFileAvailable', array($parameters));
  }

  /**
   * 
   * @param GetFileAvailable $parameters
   * @access public
   */
  public function GetFileAvailable(GetFileAvailable $parameters)
  {
    return $this->__soapCall('GetFileAvailable', array($parameters));
  }

  /**
   * 
   * @param AddFileToSyncByArcCue $parameters
   * @access public
   */
  public function AddFileToSyncByArcCue(AddFileToSyncByArcCue $parameters)
  {
    return $this->__soapCall('AddFileToSyncByArcCue', array($parameters));
  }

  /**
   * 
   * @param Fk_DB_testConnection $parameters
   * @access public
   */
  public function Fk_DB_testConnection(Fk_DB_testConnection $parameters)
  {
    return $this->__soapCall('Fk_DB_testConnection', array($parameters));
  }

  /**
   * 
   * @param Fk_WS_insert $parameters
   * @access public
   */
  public function Fk_WS_insert(Fk_WS_insert $parameters)
  {
    return $this->__soapCall('Fk_WS_insert', array($parameters));
  }

  /**
   * 
   * @param Fk_DB_modify $parameters
   * @access public
   */
  public function Fk_DB_modify(Fk_DB_modify $parameters)
  {
    return $this->__soapCall('Fk_DB_modify', array($parameters));
  }

  /**
   * 
   * @param Fk_DB_delete $parameters
   * @access public
   */
  public function Fk_DB_delete(Fk_DB_delete $parameters)
  {
    return $this->__soapCall('Fk_DB_delete', array($parameters));
  }

  /**
   * 
   * @param Fk_getParsAllFk $parameters
   * @access public
   */
  public function Fk_getParsAllFk(Fk_getParsAllFk $parameters)
  {
    return $this->__soapCall('Fk_getParsAllFk', array($parameters));
  }

  /**
   * 
   * @param Fk_getPars $parameters
   * @access public
   */
  public function Fk_getPars(Fk_getPars $parameters)
  {
    return $this->__soapCall('Fk_getPars', array($parameters));
  }

  /**
   * 
   * @param Fk_create $parameters
   * @access public
   */
  public function Fk_create(Fk_create $parameters)
  {
    return $this->__soapCall('Fk_create', array($parameters));
  }

  /**
   * 
   * @param GetLanguages $parameters
   * @access public
   */
  public function GetLanguages(GetLanguages $parameters)
  {
    return $this->__soapCall('GetLanguages', array($parameters));
  }

  /**
   * 
   * @param AddLogSDK $parameters
   * @access public
   */
  public function AddLogSDK(AddLogSDK $parameters)
  {
    return $this->__soapCall('AddLogSDK', array($parameters));
  }

  /**
   * 
   * @param GetSDKLogList $parameters
   * @access public
   */
  public function GetSDKLogList(GetSDKLogList $parameters)
  {
    return $this->__soapCall('GetSDKLogList', array($parameters));
  }

  /**
   * 
   * @param DeleteSDKLog $parameters
   * @access public
   */
  public function DeleteSDKLog(DeleteSDKLog $parameters)
  {
    return $this->__soapCall('DeleteSDKLog', array($parameters));
  }

  /**
   * 
   * @param ResetUserSessions $parameters
   * @access public
   */
  public function ResetUserSessions(ResetUserSessions $parameters)
  {
    return $this->__soapCall('ResetUserSessions', array($parameters));
  }

  /**
   * 
   * @param ValidateSession $parameters
   * @access public
   */
  public function ValidateSession(ValidateSession $parameters)
  {
    return $this->__soapCall('ValidateSession', array($parameters));
  }

  /**
   * 
   * @param GetUserList $parameters
   * @access public
   */
  public function GetUserList(GetUserList $parameters)
  {
    return $this->__soapCall('GetUserList', array($parameters));
  }

  /**
   * 
   * @param GetUserListActiveDirectory $parameters
   * @access public
   */
  public function GetUserListActiveDirectory(GetUserListActiveDirectory $parameters)
  {
    return $this->__soapCall('GetUserListActiveDirectory', array($parameters));
  }

  /**
   * 
   * @param InsertUser $parameters
   * @access public
   */
  public function InsertUser(InsertUser $parameters)
  {
    return $this->__soapCall('InsertUser', array($parameters));
  }

  /**
   * 
   * @param ModifyUser $parameters
   * @access public
   */
  public function ModifyUser(ModifyUser $parameters)
  {
    return $this->__soapCall('ModifyUser', array($parameters));
  }

  /**
   * 
   * @param InsertUserConfig $parameters
   * @access public
   */
  public function InsertUserConfig(InsertUserConfig $parameters)
  {
    return $this->__soapCall('InsertUserConfig', array($parameters));
  }

  /**
   * 
   * @param ModifyUserConfig $parameters
   * @access public
   */
  public function ModifyUserConfig(ModifyUserConfig $parameters)
  {
    return $this->__soapCall('ModifyUserConfig', array($parameters));
  }

  /**
   * 
   * @param GetUserDetailByUsername $parameters
   * @access public
   */
  public function GetUserDetailByUsername(GetUserDetailByUsername $parameters)
  {
    return $this->__soapCall('GetUserDetailByUsername', array($parameters));
  }

  /**
   * 
   * @param GetUserDetailByUserId $parameters
   * @access public
   */
  public function GetUserDetailByUserId(GetUserDetailByUserId $parameters)
  {
    return $this->__soapCall('GetUserDetailByUserId', array($parameters));
  }

  /**
   * 
   * @param ExistUserByUsername $parameters
   * @access public
   */
  public function ExistUserByUsername(ExistUserByUsername $parameters)
  {
    return $this->__soapCall('ExistUserByUsername', array($parameters));
  }

  /**
   * 
   * @param InsertGroup $parameters
   * @access public
   */
  public function InsertGroup(InsertGroup $parameters)
  {
    return $this->__soapCall('InsertGroup', array($parameters));
  }

  /**
   * 
   * @param DeleteGroup $parameters
   * @access public
   */
  public function DeleteGroup(DeleteGroup $parameters)
  {
    return $this->__soapCall('DeleteGroup', array($parameters));
  }

  /**
   * 
   * @param Ping $parameters
   * @access public
   */
  public function Ping(Ping $parameters)
  {
    return $this->__soapCall('Ping', array($parameters));
  }

  /**
   * 
   * @param DeleteUserByUsername $parameters
   * @access public
   */
  public function DeleteUserByUsername(DeleteUserByUsername $parameters)
  {
    return $this->__soapCall('DeleteUserByUsername', array($parameters));
  }

  /**
   * 
   * @param ModifyGroup $parameters
   * @access public
   */
  public function ModifyGroup(ModifyGroup $parameters)
  {
    return $this->__soapCall('ModifyGroup', array($parameters));
  }

  /**
   * 
   * @param GetGroupList $parameters
   * @access public
   */
  public function GetGroupList(GetGroupList $parameters)
  {
    return $this->__soapCall('GetGroupList', array($parameters));
  }

  /**
   * 
   * @param InsertUserInGroup $parameters
   * @access public
   */
  public function InsertUserInGroup(InsertUserInGroup $parameters)
  {
    return $this->__soapCall('InsertUserInGroup', array($parameters));
  }

  /**
   * 
   * @param RemoveUserByAllGroups $parameters
   * @access public
   */
  public function RemoveUserByAllGroups(RemoveUserByAllGroups $parameters)
  {
    return $this->__soapCall('RemoveUserByAllGroups', array($parameters));
  }

  /**
   * 
   * @param RemoveUserByGroup $parameters
   * @access public
   */
  public function RemoveUserByGroup(RemoveUserByGroup $parameters)
  {
    return $this->__soapCall('RemoveUserByGroup', array($parameters));
  }

  /**
   * 
   * @param GetGroupsListByUser $parameters
   * @access public
   */
  public function GetGroupsListByUser(GetGroupsListByUser $parameters)
  {
    return $this->__soapCall('GetGroupsListByUser', array($parameters));
  }

  /**
   * 
   * @param GetUsersListByGroup $parameters
   * @access public
   */
  public function GetUsersListByGroup(GetUsersListByGroup $parameters)
  {
    return $this->__soapCall('GetUsersListByGroup', array($parameters));
  }

  /**
   * 
   * @param ModifyTranslation $parameters
   * @access public
   */
  public function ModifyTranslation(ModifyTranslation $parameters)
  {
    return $this->__soapCall('ModifyTranslation', array($parameters));
  }

  /**
   * 
   * @param DeleteTranslation $parameters
   * @access public
   */
  public function DeleteTranslation(DeleteTranslation $parameters)
  {
    return $this->__soapCall('DeleteTranslation', array($parameters));
  }

  /**
   * 
   * @param InsertTranslation $parameters
   * @access public
   */
  public function InsertTranslation(InsertTranslation $parameters)
  {
    return $this->__soapCall('InsertTranslation', array($parameters));
  }

  /**
   * 
   * @param InsertTranslationCode $parameters
   * @access public
   */
  public function InsertTranslationCode(InsertTranslationCode $parameters)
  {
    return $this->__soapCall('InsertTranslationCode', array($parameters));
  }

  /**
   * 
   * @param InsertTranslationDecimalCode $parameters
   * @access public
   */
  public function InsertTranslationDecimalCode(InsertTranslationDecimalCode $parameters)
  {
    return $this->__soapCall('InsertTranslationDecimalCode', array($parameters));
  }

  /**
   * 
   * @param GetTranslationByMessageId $parameters
   * @access public
   */
  public function GetTranslationByMessageId(GetTranslationByMessageId $parameters)
  {
    return $this->__soapCall('GetTranslationByMessageId', array($parameters));
  }

  /**
   * 
   * @param GetTranslationByLabelCode $parameters
   * @access public
   */
  public function GetTranslationByLabelCode(GetTranslationByLabelCode $parameters)
  {
    return $this->__soapCall('GetTranslationByLabelCode', array($parameters));
  }

  /**
   * 
   * @param GetTranslationByRangeLabelCode $parameters
   * @access public
   */
  public function GetTranslationByRangeLabelCode(GetTranslationByRangeLabelCode $parameters)
  {
    return $this->__soapCall('GetTranslationByRangeLabelCode', array($parameters));
  }

  /**
   * 
   * @param GetTranslationBySourceSuffix $parameters
   * @access public
   */
  public function GetTranslationBySourceSuffix(GetTranslationBySourceSuffix $parameters)
  {
    return $this->__soapCall('GetTranslationBySourceSuffix', array($parameters));
  }

  /**
   * 
   * @param DeleteTranslationByCode $parameters
   * @access public
   */
  public function DeleteTranslationByCode(DeleteTranslationByCode $parameters)
  {
    return $this->__soapCall('DeleteTranslationByCode', array($parameters));
  }

  /**
   * 
   * @param AddDefaultProcess $parameters
   * @access public
   */
  public function AddDefaultProcess(AddDefaultProcess $parameters)
  {
    return $this->__soapCall('AddDefaultProcess', array($parameters));
  }

  /**
   * 
   * @param ModDefaultProcess $parameters
   * @access public
   */
  public function ModDefaultProcess(ModDefaultProcess $parameters)
  {
    return $this->__soapCall('ModDefaultProcess', array($parameters));
  }

  /**
   * 
   * @param DelDefaultProcess $parameters
   * @access public
   */
  public function DelDefaultProcess(DelDefaultProcess $parameters)
  {
    return $this->__soapCall('DelDefaultProcess', array($parameters));
  }

  /**
   * 
   * @param GetDefaultProcess $parameters
   * @access public
   */
  public function GetDefaultProcess(GetDefaultProcess $parameters)
  {
    return $this->__soapCall('GetDefaultProcess', array($parameters));
  }

  /**
   * 
   * @param AddMarker $parameters
   * @access public
   */
  public function AddMarker(AddMarker $parameters)
  {
    return $this->__soapCall('AddMarker', array($parameters));
  }

  /**
   * 
   * @param DelMarker $parameters
   * @access public
   */
  public function DelMarker(DelMarker $parameters)
  {
    return $this->__soapCall('DelMarker', array($parameters));
  }

  /**
   * 
   * @param GetListMarker $parameters
   * @access public
   */
  public function GetListMarker(GetListMarker $parameters)
  {
    return $this->__soapCall('GetListMarker', array($parameters));
  }

  /**
   * 
   * @param GetWorkflowVariables $parameters
   * @access public
   */
  public function GetWorkflowVariables(GetWorkflowVariables $parameters)
  {
    return $this->__soapCall('GetWorkflowVariables', array($parameters));
  }

  /**
   * 
   * @param AddSign $parameters
   * @access public
   */
  public function AddSign(AddSign $parameters)
  {
    return $this->__soapCall('AddSign', array($parameters));
  }

  /**
   * 
   * @param DelSign $parameters
   * @access public
   */
  public function DelSign(DelSign $parameters)
  {
    return $this->__soapCall('DelSign', array($parameters));
  }

  /**
   * 
   * @param GetSign $parameters
   * @access public
   */
  public function GetSign(GetSign $parameters)
  {
    return $this->__soapCall('GetSign', array($parameters));
  }

  /**
   * 
   * @param GetContSign $parameters
   * @access public
   */
  public function GetContSign(GetContSign $parameters)
  {
    return $this->__soapCall('GetContSign', array($parameters));
  }

  /**
   * 
   * @param GetContSignByUser $parameters
   * @access public
   */
  public function GetContSignByUser(GetContSignByUser $parameters)
  {
    return $this->__soapCall('GetContSignByUser', array($parameters));
  }

  /**
   * 
   * @param ModSign $parameters
   * @access public
   */
  public function ModSign(ModSign $parameters)
  {
    return $this->__soapCall('ModSign', array($parameters));
  }

  /**
   * 
   * @param AddUserSettings $parameters
   * @access public
   */
  public function AddUserSettings(AddUserSettings $parameters)
  {
    return $this->__soapCall('AddUserSettings', array($parameters));
  }

  /**
   * 
   * @param ModUserSettings $parameters
   * @access public
   */
  public function ModUserSettings(ModUserSettings $parameters)
  {
    return $this->__soapCall('ModUserSettings', array($parameters));
  }

  /**
   * 
   * @param DelUserSettings $parameters
   * @access public
   */
  public function DelUserSettings(DelUserSettings $parameters)
  {
    return $this->__soapCall('DelUserSettings', array($parameters));
  }

  /**
   * 
   * @param GetUserSettings $parameters
   * @access public
   */
  public function GetUserSettings(GetUserSettings $parameters)
  {
    return $this->__soapCall('GetUserSettings', array($parameters));
  }

  /**
   * 
   * @param InsertData $parameters
   * @access public
   */
  public function InsertData(InsertData $parameters)
  {
    return $this->__soapCall('InsertData', array($parameters));
  }

  /**
   * 
   * @param CanInsertData $parameters
   * @access public
   */
  public function CanInsertData(CanInsertData $parameters)
  {
    return $this->__soapCall('CanInsertData', array($parameters));
  }

  /**
   * 
   * @param CopyData $parameters
   * @access public
   */
  public function CopyData(CopyData $parameters)
  {
    return $this->__soapCall('CopyData', array($parameters));
  }

  /**
   * 
   * @param MoveData $parameters
   * @access public
   */
  public function MoveData(MoveData $parameters)
  {
    return $this->__soapCall('MoveData', array($parameters));
  }

  /**
   * 
   * @param ModifyData $parameters
   * @access public
   */
  public function ModifyData(ModifyData $parameters)
  {
    return $this->__soapCall('ModifyData', array($parameters));
  }

  /**
   * 
   * @param CanModifyData $parameters
   * @access public
   */
  public function CanModifyData(CanModifyData $parameters)
  {
    return $this->__soapCall('CanModifyData', array($parameters));
  }

  /**
   * 
   * @param DeleteData $parameters
   * @access public
   */
  public function DeleteData(DeleteData $parameters)
  {
    return $this->__soapCall('DeleteData', array($parameters));
  }

  /**
   * 
   * @param CanDeleteData $parameters
   * @access public
   */
  public function CanDeleteData(CanDeleteData $parameters)
  {
    return $this->__soapCall('CanDeleteData', array($parameters));
  }

  /**
   * 
   * @param GetData $parameters
   * @access public
   */
  public function GetData(GetData $parameters)
  {
    return $this->__soapCall('GetData', array($parameters));
  }

  /**
   * 
   * @param GetDataLimit $parameters
   * @access public
   */
  public function GetDataLimit(GetDataLimit $parameters)
  {
    return $this->__soapCall('GetDataLimit', array($parameters));
  }

  /**
   * 
   * @param GetDataByIdForSecurity $parameters
   * @access public
   */
  public function GetDataByIdForSecurity(GetDataByIdForSecurity $parameters)
  {
    return $this->__soapCall('GetDataByIdForSecurity', array($parameters));
  }

  /**
   * 
   * @param GetDataById $parameters
   * @access public
   */
  public function GetDataById(GetDataById $parameters)
  {
    return $this->__soapCall('GetDataById', array($parameters));
  }

  /**
   * 
   * @param GetDataCountWithoutPermission $parameters
   * @access public
   */
  public function GetDataCountWithoutPermission(GetDataCountWithoutPermission $parameters)
  {
    return $this->__soapCall('GetDataCountWithoutPermission', array($parameters));
  }

  /**
   * 
   * @param GetDataCountWithPermission $parameters
   * @access public
   */
  public function GetDataCountWithPermission(GetDataCountWithPermission $parameters)
  {
    return $this->__soapCall('GetDataCountWithPermission', array($parameters));
  }

  /**
   * 
   * @param InsertProtocol $parameters
   * @access public
   */
  public function InsertProtocol(InsertProtocol $parameters)
  {
    return $this->__soapCall('InsertProtocol', array($parameters));
  }

  /**
   * 
   * @param EditProtocol $parameters
   * @access public
   */
  public function EditProtocol(EditProtocol $parameters)
  {
    return $this->__soapCall('EditProtocol', array($parameters));
  }

  /**
   * 
   * @param DeleteProtocol $parameters
   * @access public
   */
  public function DeleteProtocol(DeleteProtocol $parameters)
  {
    return $this->__soapCall('DeleteProtocol', array($parameters));
  }

  /**
   * 
   * @param ShowProtocol $parameters
   * @access public
   */
  public function ShowProtocol(ShowProtocol $parameters)
  {
    return $this->__soapCall('ShowProtocol', array($parameters));
  }

  /**
   * 
   * @param GetProtocolList $parameters
   * @access public
   */
  public function GetProtocolList(GetProtocolList $parameters)
  {
    return $this->__soapCall('GetProtocolList', array($parameters));
  }

  /**
   * 
   * @param GetProtocolById $parameters
   * @access public
   */
  public function GetProtocolById(GetProtocolById $parameters)
  {
    return $this->__soapCall('GetProtocolById', array($parameters));
  }

  /**
   * 
   * @param GetProtocolByName $parameters
   * @access public
   */
  public function GetProtocolByName(GetProtocolByName $parameters)
  {
    return $this->__soapCall('GetProtocolByName', array($parameters));
  }

  /**
   * 
   * @param GetProtocolByDesc $parameters
   * @access public
   */
  public function GetProtocolByDesc(GetProtocolByDesc $parameters)
  {
    return $this->__soapCall('GetProtocolByDesc', array($parameters));
  }

  /**
   * 
   * @param GetProtocolByNameDesc $parameters
   * @access public
   */
  public function GetProtocolByNameDesc(GetProtocolByNameDesc $parameters)
  {
    return $this->__soapCall('GetProtocolByNameDesc', array($parameters));
  }

  /**
   * 
   * @param CanUseProtocol $parameters
   * @access public
   */
  public function CanUseProtocol(CanUseProtocol $parameters)
  {
    return $this->__soapCall('CanUseProtocol', array($parameters));
  }

  /**
   * 
   * @param CanAddNewYear $parameters
   * @access public
   */
  public function CanAddNewYear(CanAddNewYear $parameters)
  {
    return $this->__soapCall('CanAddNewYear', array($parameters));
  }

  /**
   * 
   * @param CanAddNewDate $parameters
   * @access public
   */
  public function CanAddNewDate(CanAddNewDate $parameters)
  {
    return $this->__soapCall('CanAddNewDate', array($parameters));
  }

  /**
   * 
   * @param CanInsertProtocol $parameters
   * @access public
   */
  public function CanInsertProtocol(CanInsertProtocol $parameters)
  {
    return $this->__soapCall('CanInsertProtocol', array($parameters));
  }

  /**
   * 
   * @param CanEditProtocol $parameters
   * @access public
   */
  public function CanEditProtocol(CanEditProtocol $parameters)
  {
    return $this->__soapCall('CanEditProtocol', array($parameters));
  }

  /**
   * 
   * @param CanDeleteProtocol $parameters
   * @access public
   */
  public function CanDeleteProtocol(CanDeleteProtocol $parameters)
  {
    return $this->__soapCall('CanDeleteProtocol', array($parameters));
  }

  /**
   * 
   * @param GetNewProtocolNumber $parameters
   * @access public
   */
  public function GetNewProtocolNumber(GetNewProtocolNumber $parameters)
  {
    return $this->__soapCall('GetNewProtocolNumber', array($parameters));
  }

  /**
   * 
   * @param SetTmpUSDownloadPath $parameters
   * @access public
   */
  public function SetTmpUSDownloadPath(SetTmpUSDownloadPath $parameters)
  {
    return $this->__soapCall('SetTmpUSDownloadPath', array($parameters));
  }

  /**
   * 
   * @param SetTmpUSUploadPath $parameters
   * @access public
   */
  public function SetTmpUSUploadPath(SetTmpUSUploadPath $parameters)
  {
    return $this->__soapCall('SetTmpUSUploadPath', array($parameters));
  }

  /**
   * 
   * @param UploadUSEndFile $parameters
   * @access public
   */
  public function UploadUSEndFile(UploadUSEndFile $parameters)
  {
    return $this->__soapCall('UploadUSEndFile', array($parameters));
  }

  /**
   * 
   * @param UploadUSEndFileWithUser $parameters
   * @access public
   */
  public function UploadUSEndFileWithUser(UploadUSEndFileWithUser $parameters)
  {
    return $this->__soapCall('UploadUSEndFileWithUser', array($parameters));
  }

  /**
   * 
   * @param UploadUSSendChunk $parameters
   * @access public
   */
  public function UploadUSSendChunk(UploadUSSendChunk $parameters)
  {
    return $this->__soapCall('UploadUSSendChunk', array($parameters));
  }

  /**
   * 
   * @param DownloadUSGetNext $parameters
   * @access public
   */
  public function DownloadUSGetNext(DownloadUSGetNext $parameters)
  {
    return $this->__soapCall('DownloadUSGetNext', array($parameters));
  }

  /**
   * 
   * @param DownloadUSGetChunk $parameters
   * @access public
   */
  public function DownloadUSGetChunk(DownloadUSGetChunk $parameters)
  {
    return $this->__soapCall('DownloadUSGetChunk', array($parameters));
  }

  /**
   * 
   * @param DownloadUSFile $parameters
   * @access public
   */
  public function DownloadUSFile(DownloadUSFile $parameters)
  {
    return $this->__soapCall('DownloadUSFile', array($parameters));
  }

  /**
   * 
   * @param GetDataUSFileDetail $parameters
   * @access public
   */
  public function GetDataUSFileDetail(GetDataUSFileDetail $parameters)
  {
    return $this->__soapCall('GetDataUSFileDetail', array($parameters));
  }

  /**
   * 
   * @param GetDataUSFileList $parameters
   * @access public
   */
  public function GetDataUSFileList(GetDataUSFileList $parameters)
  {
    return $this->__soapCall('GetDataUSFileList', array($parameters));
  }

  /**
   * 
   * @param GetDataUSFileListByUsername $parameters
   * @access public
   */
  public function GetDataUSFileListByUsername(GetDataUSFileListByUsername $parameters)
  {
    return $this->__soapCall('GetDataUSFileListByUsername', array($parameters));
  }

  /**
   * 
   * @param InsertUSFile $parameters
   * @access public
   */
  public function InsertUSFile(InsertUSFile $parameters)
  {
    return $this->__soapCall('InsertUSFile', array($parameters));
  }

  /**
   * 
   * @param InsertUSFileWithUser $parameters
   * @access public
   */
  public function InsertUSFileWithUser(InsertUSFileWithUser $parameters)
  {
    return $this->__soapCall('InsertUSFileWithUser', array($parameters));
  }

  /**
   * 
   * @param DeleteUSFileById $parameters
   * @access public
   */
  public function DeleteUSFileById(DeleteUSFileById $parameters)
  {
    return $this->__soapCall('DeleteUSFileById', array($parameters));
  }

  /**
   * 
   * @param DeleteUSFileByCode $parameters
   * @access public
   */
  public function DeleteUSFileByCode(DeleteUSFileByCode $parameters)
  {
    return $this->__soapCall('DeleteUSFileByCode', array($parameters));
  }

  /**
   * 
   * @param SetTmpWFDownloadPath $parameters
   * @access public
   */
  public function SetTmpWFDownloadPath(SetTmpWFDownloadPath $parameters)
  {
    return $this->__soapCall('SetTmpWFDownloadPath', array($parameters));
  }

  /**
   * 
   * @param SetTmpWFUploadPath $parameters
   * @access public
   */
  public function SetTmpWFUploadPath(SetTmpWFUploadPath $parameters)
  {
    return $this->__soapCall('SetTmpWFUploadPath', array($parameters));
  }

  /**
   * 
   * @param UploadWFEndFile $parameters
   * @access public
   */
  public function UploadWFEndFile(UploadWFEndFile $parameters)
  {
    return $this->__soapCall('UploadWFEndFile', array($parameters));
  }

  /**
   * 
   * @param UploadWFSendChunk $parameters
   * @access public
   */
  public function UploadWFSendChunk(UploadWFSendChunk $parameters)
  {
    return $this->__soapCall('UploadWFSendChunk', array($parameters));
  }

  /**
   * 
   * @param DownloadWFEndFile $parameters
   * @access public
   */
  public function DownloadWFEndFile(DownloadWFEndFile $parameters)
  {
    return $this->__soapCall('DownloadWFEndFile', array($parameters));
  }

  /**
   * 
   * @param DownloadWFFile $parameters
   * @access public
   */
  public function DownloadWFFile(DownloadWFFile $parameters)
  {
    return $this->__soapCall('DownloadWFFile', array($parameters));
  }

  /**
   * 
   * @param GetDataWFFileDetail $parameters
   * @access public
   */
  public function GetDataWFFileDetail(GetDataWFFileDetail $parameters)
  {
    return $this->__soapCall('GetDataWFFileDetail', array($parameters));
  }

  /**
   * 
   * @param GetDataWFFileList $parameters
   * @access public
   */
  public function GetDataWFFileList(GetDataWFFileList $parameters)
  {
    return $this->__soapCall('GetDataWFFileList', array($parameters));
  }

  /**
   * 
   * @param InsertWFFile $parameters
   * @access public
   */
  public function InsertWFFile(InsertWFFile $parameters)
  {
    return $this->__soapCall('InsertWFFile', array($parameters));
  }

  /**
   * 
   * @param DeleteWFFileById $parameters
   * @access public
   */
  public function DeleteWFFileById(DeleteWFFileById $parameters)
  {
    return $this->__soapCall('DeleteWFFileById', array($parameters));
  }

  /**
   * 
   * @param DeleteWFFileByCode $parameters
   * @access public
   */
  public function DeleteWFFileByCode(DeleteWFFileByCode $parameters)
  {
    return $this->__soapCall('DeleteWFFileByCode', array($parameters));
  }

  /**
   * 
   * @param TestLettura $parameters
   * @access public
   */
  public function TestLettura(TestLettura $parameters)
  {
    return $this->__soapCall('TestLettura', array($parameters));
  }

  /**
   * 
   * @param TestScritturaLettura $parameters
   * @access public
   */
  public function TestScritturaLettura(TestScritturaLettura $parameters)
  {
    return $this->__soapCall('TestScritturaLettura', array($parameters));
  }

  /**
   * 
   * @param SaveChars $parameters
   * @access public
   */
  public function SaveChars(SaveChars $parameters)
  {
    return $this->__soapCall('SaveChars', array($parameters));
  }

  /**
   * 
   * @param AddUser $parameters
   * @access public
   */
  public function AddUser(AddUser $parameters)
  {
    return $this->__soapCall('AddUser', array($parameters));
  }

  /**
   * 
   * @param ModUser $parameters
   * @access public
   */
  public function ModUser(ModUser $parameters)
  {
    return $this->__soapCall('ModUser', array($parameters));
  }

  /**
   * 
   * @param VerifyExpression $parameters
   * @access public
   */
  public function VerifyExpression(VerifyExpression $parameters)
  {
    return $this->__soapCall('VerifyExpression', array($parameters));
  }

  /**
   * 
   * @param AddExpression $parameters
   * @access public
   */
  public function AddExpression(AddExpression $parameters)
  {
    return $this->__soapCall('AddExpression', array($parameters));
  }

  /**
   * 
   * @param ModExpression $parameters
   * @access public
   */
  public function ModExpression(ModExpression $parameters)
  {
    return $this->__soapCall('ModExpression', array($parameters));
  }

  /**
   * 
   * @param DelExpression $parameters
   * @access public
   */
  public function DelExpression(DelExpression $parameters)
  {
    return $this->__soapCall('DelExpression', array($parameters));
  }

  /**
   * 
   * @param GetExpression $parameters
   * @access public
   */
  public function GetExpression(GetExpression $parameters)
  {
    return $this->__soapCall('GetExpression', array($parameters));
  }

  /**
   * 
   * @param GetAllContainerExpressions $parameters
   * @access public
   */
  public function GetAllContainerExpressions(GetAllContainerExpressions $parameters)
  {
    return $this->__soapCall('GetAllContainerExpressions', array($parameters));
  }

  /**
   * 
   * @param GetExpressionValue $parameters
   * @access public
   */
  public function GetExpressionValue(GetExpressionValue $parameters)
  {
    return $this->__soapCall('GetExpressionValue', array($parameters));
  }

  /**
   * 
   * @param SetTmpTPDownloadPath $parameters
   * @access public
   */
  public function SetTmpTPDownloadPath(SetTmpTPDownloadPath $parameters)
  {
    return $this->__soapCall('SetTmpTPDownloadPath', array($parameters));
  }

  /**
   * 
   * @param SetTmpTPUploadPath $parameters
   * @access public
   */
  public function SetTmpTPUploadPath(SetTmpTPUploadPath $parameters)
  {
    return $this->__soapCall('SetTmpTPUploadPath', array($parameters));
  }

  /**
   * 
   * @param UploadTPEndFile $parameters
   * @access public
   */
  public function UploadTPEndFile(UploadTPEndFile $parameters)
  {
    return $this->__soapCall('UploadTPEndFile', array($parameters));
  }

  /**
   * 
   * @param UploadTPSendChunk $parameters
   * @access public
   */
  public function UploadTPSendChunk(UploadTPSendChunk $parameters)
  {
    return $this->__soapCall('UploadTPSendChunk', array($parameters));
  }

  /**
   * 
   * @param DownloadTPEndFile $parameters
   * @access public
   */
  public function DownloadTPEndFile(DownloadTPEndFile $parameters)
  {
    return $this->__soapCall('DownloadTPEndFile', array($parameters));
  }

  /**
   * 
   * @param DownloadTPFile $parameters
   * @access public
   */
  public function DownloadTPFile(DownloadTPFile $parameters)
  {
    return $this->__soapCall('DownloadTPFile', array($parameters));
  }

  /**
   * 
   * @param GetDataTPFileDetail $parameters
   * @access public
   */
  public function GetDataTPFileDetail(GetDataTPFileDetail $parameters)
  {
    return $this->__soapCall('GetDataTPFileDetail', array($parameters));
  }

  /**
   * 
   * @param GetDataTPFileList $parameters
   * @access public
   */
  public function GetDataTPFileList(GetDataTPFileList $parameters)
  {
    return $this->__soapCall('GetDataTPFileList', array($parameters));
  }

  /**
   * 
   * @param InsertTPFile $parameters
   * @access public
   */
  public function InsertTPFile(InsertTPFile $parameters)
  {
    return $this->__soapCall('InsertTPFile', array($parameters));
  }

  /**
   * 
   * @param DeleteTPFileById $parameters
   * @access public
   */
  public function DeleteTPFileById(DeleteTPFileById $parameters)
  {
    return $this->__soapCall('DeleteTPFileById', array($parameters));
  }

  /**
   * 
   * @param DeleteTPFileByCode $parameters
   * @access public
   */
  public function DeleteTPFileByCode(DeleteTPFileByCode $parameters)
  {
    return $this->__soapCall('DeleteTPFileByCode', array($parameters));
  }

  /**
   * 
   * @param GetDataTPFileListByUsername $parameters
   * @access public
   */
  public function GetDataTPFileListByUsername(GetDataTPFileListByUsername $parameters)
  {
    return $this->__soapCall('GetDataTPFileListByUsername', array($parameters));
  }

  /**
   * 
   * @param GetDataTPFileListByContainer $parameters
   * @access public
   */
  public function GetDataTPFileListByContainer(GetDataTPFileListByContainer $parameters)
  {
    return $this->__soapCall('GetDataTPFileListByContainer', array($parameters));
  }

  /**
   * 
   * @param GetDataTPFileListByDocument $parameters
   * @access public
   */
  public function GetDataTPFileListByDocument(GetDataTPFileListByDocument $parameters)
  {
    return $this->__soapCall('GetDataTPFileListByDocument', array($parameters));
  }

  /**
   * 
   * @param GetDataTPFileListByName $parameters
   * @access public
   */
  public function GetDataTPFileListByName(GetDataTPFileListByName $parameters)
  {
    return $this->__soapCall('GetDataTPFileListByName', array($parameters));
  }

  /**
   * 
   * @param GetDefaultObjActList $parameters
   * @access public
   */
  public function GetDefaultObjActList(GetDefaultObjActList $parameters)
  {
    return $this->__soapCall('GetDefaultObjActList', array($parameters));
  }

  /**
   * 
   * @param EndPermissionSettings $parameters
   * @access public
   */
  public function EndPermissionSettings(EndPermissionSettings $parameters)
  {
    return $this->__soapCall('EndPermissionSettings', array($parameters));
  }

  /**
   * 
   * @param DownloadGetChunkWA $parameters
   * @access public
   */
  public function DownloadGetChunkWA(DownloadGetChunkWA $parameters)
  {
    return $this->__soapCall('DownloadGetChunkWA', array($parameters));
  }

  /**
   * 
   * @param GetSchedulerTaskByTaskTypeId $parameters
   * @access public
   */
  public function GetSchedulerTaskByTaskTypeId(GetSchedulerTaskByTaskTypeId $parameters)
  {
    return $this->__soapCall('GetSchedulerTaskByTaskTypeId', array($parameters));
  }

  /**
   * 
   * @param GetAllFilter $parameters
   * @access public
   */
  public function GetAllFilter(GetAllFilter $parameters)
  {
    return $this->__soapCall('GetAllFilter', array($parameters));
  }

  /**
   * 
   * @param CanAddDigitalSignature $parameters
   * @access public
   */
  public function CanAddDigitalSignature(CanAddDigitalSignature $parameters)
  {
    return $this->__soapCall('CanAddDigitalSignature', array($parameters));
  }

  /**
   * 
   * @param GetSDKTasks $parameters
   * @access public
   */
  public function GetSDKTasks(GetSDKTasks $parameters)
  {
    return $this->__soapCall('GetSDKTasks', array($parameters));
  }

  /**
   * 
   * @param GetSDKTaskWatchFolder $parameters
   * @access public
   */
  public function GetSDKTaskWatchFolder(GetSDKTaskWatchFolder $parameters)
  {
    return $this->__soapCall('GetSDKTaskWatchFolder', array($parameters));
  }

  /**
   * 
   * @param GetSDKRules $parameters
   * @access public
   */
  public function GetSDKRules(GetSDKRules $parameters)
  {
    return $this->__soapCall('GetSDKRules', array($parameters));
  }

  /**
   * 
   * @param CreateSDKTask $parameters
   * @access public
   */
  public function CreateSDKTask(CreateSDKTask $parameters)
  {
    return $this->__soapCall('CreateSDKTask', array($parameters));
  }

  /**
   * 
   * @param ModifySDKTask $parameters
   * @access public
   */
  public function ModifySDKTask(ModifySDKTask $parameters)
  {
    return $this->__soapCall('ModifySDKTask', array($parameters));
  }

  /**
   * 
   * @param GetSDKTaskFieldMapping $parameters
   * @access public
   */
  public function GetSDKTaskFieldMapping(GetSDKTaskFieldMapping $parameters)
  {
    return $this->__soapCall('GetSDKTaskFieldMapping', array($parameters));
  }

  /**
   * 
   * @param CreateSDKTaskFieldMapping $parameters
   * @access public
   */
  public function CreateSDKTaskFieldMapping(CreateSDKTaskFieldMapping $parameters)
  {
    return $this->__soapCall('CreateSDKTaskFieldMapping', array($parameters));
  }

  /**
   * 
   * @param DeleteSDKTaskFieldMapping $parameters
   * @access public
   */
  public function DeleteSDKTaskFieldMapping(DeleteSDKTaskFieldMapping $parameters)
  {
    return $this->__soapCall('DeleteSDKTaskFieldMapping', array($parameters));
  }

  /**
   * 
   * @param StoreSDKVariable $parameters
   * @access public
   */
  public function StoreSDKVariable(StoreSDKVariable $parameters)
  {
    return $this->__soapCall('StoreSDKVariable', array($parameters));
  }

  /**
   * 
   * @param GetSDKVariables $parameters
   * @access public
   */
  public function GetSDKVariables(GetSDKVariables $parameters)
  {
    return $this->__soapCall('GetSDKVariables', array($parameters));
  }

  /**
   * 
   * @param GetSDKTaskExcelPreview $parameters
   * @access public
   */
  public function GetSDKTaskExcelPreview(GetSDKTaskExcelPreview $parameters)
  {
    return $this->__soapCall('GetSDKTaskExcelPreview', array($parameters));
  }

  /**
   * 
   * @param ValidateSDKTask $parameters
   * @access public
   */
  public function ValidateSDKTask(ValidateSDKTask $parameters)
  {
    return $this->__soapCall('ValidateSDKTask', array($parameters));
  }

  /**
   * 
   * @param VerifySDKTaskNameExists $parameters
   * @access public
   */
  public function VerifySDKTaskNameExists(VerifySDKTaskNameExists $parameters)
  {
    return $this->__soapCall('VerifySDKTaskNameExists', array($parameters));
  }

  /**
   * 
   * @param UploadPreviewFile $parameters
   * @access public
   */
  public function UploadPreviewFile(UploadPreviewFile $parameters)
  {
    return $this->__soapCall('UploadPreviewFile', array($parameters));
  }

  /**
   * 
   * @param CreateSDKTaskWatchFolder $parameters
   * @access public
   */
  public function CreateSDKTaskWatchFolder(CreateSDKTaskWatchFolder $parameters)
  {
    return $this->__soapCall('CreateSDKTaskWatchFolder', array($parameters));
  }

  /**
   * 
   * @param ModifySDKTaskWatchFolder $parameters
   * @access public
   */
  public function ModifySDKTaskWatchFolder(ModifySDKTaskWatchFolder $parameters)
  {
    return $this->__soapCall('ModifySDKTaskWatchFolder', array($parameters));
  }

  /**
   * 
   * @param GetSDKWatchFolderDirectories $parameters
   * @access public
   */
  public function GetSDKWatchFolderDirectories(GetSDKWatchFolderDirectories $parameters)
  {
    return $this->__soapCall('GetSDKWatchFolderDirectories', array($parameters));
  }

  /**
   * 
   * @param GetSDKImagesFromPDFTemplate $parameters
   * @access public
   */
  public function GetSDKImagesFromPDFTemplate(GetSDKImagesFromPDFTemplate $parameters)
  {
    return $this->__soapCall('GetSDKImagesFromPDFTemplate', array($parameters));
  }

  /**
   * 
   * @param ExtractSDKPDFTemplateTextByArea $parameters
   * @access public
   */
  public function ExtractSDKPDFTemplateTextByArea(ExtractSDKPDFTemplateTextByArea $parameters)
  {
    return $this->__soapCall('ExtractSDKPDFTemplateTextByArea', array($parameters));
  }

  /**
   * 
   * @param GetSDKTextFromTemplate $parameters
   * @access public
   */
  public function GetSDKTextFromTemplate(GetSDKTextFromTemplate $parameters)
  {
    return $this->__soapCall('GetSDKTextFromTemplate', array($parameters));
  }

  /**
   * 
   * @param ChangeSDKTaskStatus $parameters
   * @access public
   */
  public function ChangeSDKTaskStatus(ChangeSDKTaskStatus $parameters)
  {
    return $this->__soapCall('ChangeSDKTaskStatus', array($parameters));
  }

  /**
   * 
   * @param StartSDKTask $parameters
   * @access public
   */
  public function StartSDKTask(StartSDKTask $parameters)
  {
    return $this->__soapCall('StartSDKTask', array($parameters));
  }

  /**
   * 
   * @param DeleteSDKTask $parameters
   * @access public
   */
  public function DeleteSDKTask(DeleteSDKTask $parameters)
  {
    return $this->__soapCall('DeleteSDKTask', array($parameters));
  }

  /**
   * 
   * @param ModifyUserPassword $parameters
   * @access public
   */
  public function ModifyUserPassword(ModifyUserPassword $parameters)
  {
    return $this->__soapCall('ModifyUserPassword', array($parameters));
  }

}
