{"id":"6deb2bdc-36c6-41f8-98c4-6331bb925301","name":"AutoApproval.ValidateApplication-taskform.frm","model":{"processName":"ValidateApplication","processId":"AutoApproval.ValidateApplication","properties":[{"name":"camelPassword","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"camelUrl","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"camelUser","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"eligibility","typeInfo":{"type":"BASE","className":"java.lang.Boolean","multiple":false},"metaData":{"entries":[]}},{"name":"input","typeInfo":{"type":"OBJECT","className":"com.btpnsyariah.autoapproval.input","multiple":false},"metaData":{"entries":[]}},{"name":"output","typeInfo":{"type":"OBJECT","className":"com.btpnsyariah.autoapproval.output","multiple":false},"metaData":{"entries":[]}},{"name":"response","typeInfo":{"type":"OBJECT","className":"com.btpnsyariah.autoapproval.response","multiple":false},"metaData":{"entries":[]}},{"name":"ruleset","typeInfo":{"type":"OBJECT","className":"java.util.HashMap","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"maxLength":100,"placeHolder":"CamelPassword","id":"field_8367263864002496E11","name":"camelPassword","label":"CamelPassword","required":false,"readOnly":false,"validateOnChange":true,"binding":"camelPassword","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"CamelUrl","id":"field_5223154111838745E12","name":"camelUrl","label":"CamelUrl","required":false,"readOnly":false,"validateOnChange":true,"binding":"camelUrl","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"CamelUser","id":"field_677646650018182E11","name":"camelUser","label":"CamelUser","required":false,"readOnly":false,"validateOnChange":true,"binding":"camelUser","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"id":"field_877745039520942E11","name":"eligibility","label":"Eligibility","required":false,"readOnly":false,"validateOnChange":true,"binding":"eligibility","standaloneClassName":"java.lang.Boolean","code":"CheckBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.checkBox.definition.CheckBoxFieldDefinition"},{"nestedForm":"0772ad3f-344d-4b4e-ab1f-6c283019a3f1","container":"FIELD_SET","id":"field_472107441246381E11","name":"input","label":"Input","required":false,"readOnly":false,"validateOnChange":true,"binding":"input","standaloneClassName":"com.btpnsyariah.autoapproval.input","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"1cc8f9ac-7e63-4d93-83ac-e03aa86411fc","container":"FIELD_SET","id":"field_748438223022401E11","name":"output","label":"Output","required":false,"readOnly":false,"validateOnChange":true,"binding":"output","standaloneClassName":"com.btpnsyariah.autoapproval.output","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_8367263864002496E11","form_id":"6deb2bdc-36c6-41f8-98c4-6331bb925301"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_5223154111838745E12","form_id":"6deb2bdc-36c6-41f8-98c4-6331bb925301"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_677646650018182E11","form_id":"6deb2bdc-36c6-41f8-98c4-6331bb925301"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_877745039520942E11","form_id":"6deb2bdc-36c6-41f8-98c4-6331bb925301"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_472107441246381E11","form_id":"6deb2bdc-36c6-41f8-98c4-6331bb925301"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_748438223022401E11","form_id":"6deb2bdc-36c6-41f8-98c4-6331bb925301"},"parts":[]}]}]}]}}