/*
 * generated by Xtext 2.23.0
 */
package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal.InternalRosSystemParser;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RosSystemParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RosSystemGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RosSystemGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
			builder.put(grammarAccess.getNamespaceAccess().getAlternatives(), "rule__Namespace__Alternatives");
			builder.put(grammarAccess.getRosSystemAccess().getGroup(), "rule__RosSystem__Group__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_0(), "rule__RosSystem__Group_5_0__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_0_2(), "rule__RosSystem__Group_5_0_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_0_2_1(), "rule__RosSystem__Group_5_0_2_1__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_1(), "rule__RosSystem__Group_5_1__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_1_2(), "rule__RosSystem__Group_5_1_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_1_2_1(), "rule__RosSystem__Group_5_1_2_1__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_2(), "rule__RosSystem__Group_5_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_2_2(), "rule__RosSystem__Group_5_2_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_2_2_1(), "rule__RosSystem__Group_5_2_2_1__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_3(), "rule__RosSystem__Group_5_3__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_3_2(), "rule__RosSystem__Group_5_3_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_3_2_1(), "rule__RosSystem__Group_5_3_2_1__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_4(), "rule__RosSystem__Group_5_4__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_4_2(), "rule__RosSystem__Group_5_4_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_5_4_2_1(), "rule__RosSystem__Group_5_4_2_1__0");
			builder.put(grammarAccess.getTopicConnectionAccess().getGroup(), "rule__TopicConnection__Group__0");
			builder.put(grammarAccess.getTopicConnectionAccess().getGroup_6(), "rule__TopicConnection__Group_6__0");
			builder.put(grammarAccess.getTopicConnectionAccess().getGroup_11(), "rule__TopicConnection__Group_11__0");
			builder.put(grammarAccess.getServiceConnectionAccess().getGroup(), "rule__ServiceConnection__Group__0");
			builder.put(grammarAccess.getServiceConnectionAccess().getGroup_6(), "rule__ServiceConnection__Group_6__0");
			builder.put(grammarAccess.getActionConnectionAccess().getGroup(), "rule__ActionConnection__Group__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup(), "rule__ComponentInterface__Group__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_4(), "rule__ComponentInterface__Group_4__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_5(), "rule__ComponentInterface__Group_5__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_0(), "rule__ComponentInterface__Group_6_0__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_0_3(), "rule__ComponentInterface__Group_6_0_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_1(), "rule__ComponentInterface__Group_6_1__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_1_3(), "rule__ComponentInterface__Group_6_1_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_2(), "rule__ComponentInterface__Group_6_2__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_2_3(), "rule__ComponentInterface__Group_6_2_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_3(), "rule__ComponentInterface__Group_6_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_3_3(), "rule__ComponentInterface__Group_6_3_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_4(), "rule__ComponentInterface__Group_6_4__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_4_3(), "rule__ComponentInterface__Group_6_4_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_5(), "rule__ComponentInterface__Group_6_5__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_5_3(), "rule__ComponentInterface__Group_6_5_3__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_6(), "rule__ComponentInterface__Group_6_6__0");
			builder.put(grammarAccess.getComponentInterfaceAccess().getGroup_6_6_3(), "rule__ComponentInterface__Group_6_6_3__0");
			builder.put(grammarAccess.getRosPublisherAccess().getGroup(), "rule__RosPublisher__Group__0");
			builder.put(grammarAccess.getRosPublisherAccess().getGroup_4(), "rule__RosPublisher__Group_4__0");
			builder.put(grammarAccess.getRosSubscriberAccess().getGroup(), "rule__RosSubscriber__Group__0");
			builder.put(grammarAccess.getRosSubscriberAccess().getGroup_4(), "rule__RosSubscriber__Group_4__0");
			builder.put(grammarAccess.getRosServiceServerAccess().getGroup(), "rule__RosServiceServer__Group__0");
			builder.put(grammarAccess.getRosServiceServerAccess().getGroup_4(), "rule__RosServiceServer__Group_4__0");
			builder.put(grammarAccess.getRosServiceClientAccess().getGroup(), "rule__RosServiceClient__Group__0");
			builder.put(grammarAccess.getRosServiceClientAccess().getGroup_4(), "rule__RosServiceClient__Group_4__0");
			builder.put(grammarAccess.getRosActionServerAccess().getGroup(), "rule__RosActionServer__Group__0");
			builder.put(grammarAccess.getRosActionServerAccess().getGroup_4(), "rule__RosActionServer__Group_4__0");
			builder.put(grammarAccess.getRosActionClientAccess().getGroup(), "rule__RosActionClient__Group__0");
			builder.put(grammarAccess.getRosActionClientAccess().getGroup_4(), "rule__RosActionClient__Group_4__0");
			builder.put(grammarAccess.getRosParameterAccess().getGroup(), "rule__RosParameter__Group__0");
			builder.put(grammarAccess.getRosParameterAccess().getGroup_4(), "rule__RosParameter__Group_4__0");
			builder.put(grammarAccess.getRosParameterAccess().getGroup_7(), "rule__RosParameter__Group_7__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_5(), "rule__Parameter__Group_5__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_6(), "rule__Parameter__Group_6__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup(), "rule__ParameterListType__Group__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup_4(), "rule__ParameterListType__Group_4__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup(), "rule__ParameterStructType__Group__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup_4(), "rule__ParameterStructType__Group_4__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup(), "rule__ParameterIntegerType__Group__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup_2(), "rule__ParameterIntegerType__Group_2__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup(), "rule__ParameterStringType__Group__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup_2(), "rule__ParameterStringType__Group_2__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup(), "rule__ParameterDoubleType__Group__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup_2(), "rule__ParameterDoubleType__Group_2__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup(), "rule__ParameterDateType__Group__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup_2(), "rule__ParameterDateType__Group_2__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup(), "rule__ParameterBooleanType__Group__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup_2(), "rule__ParameterBooleanType__Group_2__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup(), "rule__ParameterBase64Type__Group__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup_2(), "rule__ParameterBase64Type__Group_2__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup(), "rule__ParameterAnyType__Group__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup_2(), "rule__ParameterAnyType__Group_2__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup(), "rule__ParameterArrayType__Group__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup_4(), "rule__ParameterArrayType__Group_4__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup_3(), "rule__ParameterList__Group_3__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup(), "rule__ParameterAny__Group__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup_3(), "rule__ParameterAny__Group_3__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup(), "rule__ParameterStruct__Group__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup_1(), "rule__ParameterStruct__Group_1__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup_1_2(), "rule__ParameterStruct__Group_1_2__0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getGroup(), "rule__ParameterStructMember__Group__0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getGroup(), "rule__ParameterStructTypeMember__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup(), "rule__GlobalNamespace__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_3(), "rule__GlobalNamespace__Group_3__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3(), "rule__GlobalNamespace__Group_3_3__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup(), "rule__RelativeNamespace_Impl__Group__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3(), "rule__RelativeNamespace_Impl__Group_3__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3(), "rule__RelativeNamespace_Impl__Group_3_3__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup(), "rule__PrivateNamespace__Group__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_3(), "rule__PrivateNamespace__Group_3__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3(), "rule__PrivateNamespace__Group_3_3__0");
			builder.put(grammarAccess.getRosSystemAccess().getNameAssignment_4(), "rule__RosSystem__NameAssignment_4");
			builder.put(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_0_2_0(), "rule__RosSystem__RosComponentAssignment_5_0_2_0");
			builder.put(grammarAccess.getRosSystemAccess().getRosComponentAssignment_5_0_2_1_1(), "rule__RosSystem__RosComponentAssignment_5_0_2_1_1");
			builder.put(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_1_2_0(), "rule__RosSystem__TopicConnectionsAssignment_5_1_2_0");
			builder.put(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_1_2_1_1(), "rule__RosSystem__TopicConnectionsAssignment_5_1_2_1_1");
			builder.put(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_5_2_2_0(), "rule__RosSystem__ServiceConnectionsAssignment_5_2_2_0");
			builder.put(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_5_2_2_1_1(), "rule__RosSystem__ServiceConnectionsAssignment_5_2_2_1_1");
			builder.put(grammarAccess.getRosSystemAccess().getActionConnectionsAssignment_5_3_2_0(), "rule__RosSystem__ActionConnectionsAssignment_5_3_2_0");
			builder.put(grammarAccess.getRosSystemAccess().getActionConnectionsAssignment_5_3_2_1_1(), "rule__RosSystem__ActionConnectionsAssignment_5_3_2_1_1");
			builder.put(grammarAccess.getRosSystemAccess().getParameterAssignment_5_4_2_0(), "rule__RosSystem__ParameterAssignment_5_4_2_0");
			builder.put(grammarAccess.getRosSystemAccess().getParameterAssignment_5_4_2_1_1(), "rule__RosSystem__ParameterAssignment_5_4_2_1_1");
			builder.put(grammarAccess.getTopicConnectionAccess().getTopicNameAssignment_1(), "rule__TopicConnection__TopicNameAssignment_1");
			builder.put(grammarAccess.getTopicConnectionAccess().getFromAssignment_5(), "rule__TopicConnection__FromAssignment_5");
			builder.put(grammarAccess.getTopicConnectionAccess().getFromAssignment_6_1(), "rule__TopicConnection__FromAssignment_6_1");
			builder.put(grammarAccess.getTopicConnectionAccess().getToAssignment_10(), "rule__TopicConnection__ToAssignment_10");
			builder.put(grammarAccess.getTopicConnectionAccess().getToAssignment_11_1(), "rule__TopicConnection__ToAssignment_11_1");
			builder.put(grammarAccess.getServiceConnectionAccess().getServiceNameAssignment_1(), "rule__ServiceConnection__ServiceNameAssignment_1");
			builder.put(grammarAccess.getServiceConnectionAccess().getFromAssignment_5(), "rule__ServiceConnection__FromAssignment_5");
			builder.put(grammarAccess.getServiceConnectionAccess().getFromAssignment_6_1(), "rule__ServiceConnection__FromAssignment_6_1");
			builder.put(grammarAccess.getServiceConnectionAccess().getToAssignment_9(), "rule__ServiceConnection__ToAssignment_9");
			builder.put(grammarAccess.getActionConnectionAccess().getActionNameAssignment_1(), "rule__ActionConnection__ActionNameAssignment_1");
			builder.put(grammarAccess.getActionConnectionAccess().getFromAssignment_4(), "rule__ActionConnection__FromAssignment_4");
			builder.put(grammarAccess.getActionConnectionAccess().getToAssignment_6(), "rule__ActionConnection__ToAssignment_6");
			builder.put(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3(), "rule__ComponentInterface__NameAssignment_3");
			builder.put(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1(), "rule__ComponentInterface__NameSpaceAssignment_4_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getFromRosNodeAssignment_5_1(), "rule__ComponentInterface__FromRosNodeAssignment_5_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_6_0_2(), "rule__ComponentInterface__RospublisherAssignment_6_0_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_6_0_3_1(), "rule__ComponentInterface__RospublisherAssignment_6_0_3_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_1_2(), "rule__ComponentInterface__RossubscriberAssignment_6_1_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_1_3_1(), "rule__ComponentInterface__RossubscriberAssignment_6_1_3_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2_2(), "rule__ComponentInterface__RosserviceserverAssignment_6_2_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2_3_1(), "rule__ComponentInterface__RosserviceserverAssignment_6_2_3_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_6_3_2(), "rule__ComponentInterface__RosserviceclientAssignment_6_3_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_6_3_3_1(), "rule__ComponentInterface__RosserviceclientAssignment_6_3_3_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_6_4_2(), "rule__ComponentInterface__RosactionserverAssignment_6_4_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_6_4_3_1(), "rule__ComponentInterface__RosactionserverAssignment_6_4_3_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_6_5_2(), "rule__ComponentInterface__RosactionclientAssignment_6_5_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_6_5_3_1(), "rule__ComponentInterface__RosactionclientAssignment_6_5_3_1");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_6_6_2(), "rule__ComponentInterface__RosparameterAssignment_6_6_2");
			builder.put(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_6_6_3_1(), "rule__ComponentInterface__RosparameterAssignment_6_6_3_1");
			builder.put(grammarAccess.getRosPublisherAccess().getNameAssignment_2(), "rule__RosPublisher__NameAssignment_2");
			builder.put(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1(), "rule__RosPublisher__NsAssignment_4_1");
			builder.put(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6(), "rule__RosPublisher__PublisherAssignment_6");
			builder.put(grammarAccess.getRosSubscriberAccess().getNameAssignment_2(), "rule__RosSubscriber__NameAssignment_2");
			builder.put(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1(), "rule__RosSubscriber__NsAssignment_4_1");
			builder.put(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6(), "rule__RosSubscriber__SubscriberAssignment_6");
			builder.put(grammarAccess.getRosServiceServerAccess().getNameAssignment_2(), "rule__RosServiceServer__NameAssignment_2");
			builder.put(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1(), "rule__RosServiceServer__NsAssignment_4_1");
			builder.put(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6(), "rule__RosServiceServer__SrvserverAssignment_6");
			builder.put(grammarAccess.getRosServiceClientAccess().getNameAssignment_2(), "rule__RosServiceClient__NameAssignment_2");
			builder.put(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1(), "rule__RosServiceClient__NsAssignment_4_1");
			builder.put(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6(), "rule__RosServiceClient__SrvclientAssignment_6");
			builder.put(grammarAccess.getRosActionServerAccess().getNameAssignment_2(), "rule__RosActionServer__NameAssignment_2");
			builder.put(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1(), "rule__RosActionServer__NsAssignment_4_1");
			builder.put(grammarAccess.getRosActionServerAccess().getActserverAssignment_6(), "rule__RosActionServer__ActserverAssignment_6");
			builder.put(grammarAccess.getRosActionClientAccess().getNameAssignment_2(), "rule__RosActionClient__NameAssignment_2");
			builder.put(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1(), "rule__RosActionClient__NsAssignment_4_1");
			builder.put(grammarAccess.getRosActionClientAccess().getActclientAssignment_6(), "rule__RosActionClient__ActclientAssignment_6");
			builder.put(grammarAccess.getRosParameterAccess().getNameAssignment_2(), "rule__RosParameter__NameAssignment_2");
			builder.put(grammarAccess.getRosParameterAccess().getNsAssignment_4_1(), "rule__RosParameter__NsAssignment_4_1");
			builder.put(grammarAccess.getRosParameterAccess().getParameterAssignment_6(), "rule__RosParameter__ParameterAssignment_6");
			builder.put(grammarAccess.getRosParameterAccess().getValueAssignment_7_1(), "rule__RosParameter__ValueAssignment_7_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_3(), "rule__Parameter__NameAssignment_3");
			builder.put(grammarAccess.getParameterAccess().getNamespaceAssignment_4_1(), "rule__Parameter__NamespaceAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_5_1(), "rule__Parameter__TypeAssignment_5_1");
			builder.put(grammarAccess.getParameterAccess().getValueAssignment_6_1(), "rule__Parameter__ValueAssignment_6_1");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3(), "rule__ParameterListType__SequenceAssignment_3");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1(), "rule__ParameterListType__SequenceAssignment_4_1");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_2(), "rule__ParameterIntegerType__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_2(), "rule__ParameterStringType__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_2(), "rule__ParameterDoubleType__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterDateTypeAccess().getDefaultAssignment_2_2(), "rule__ParameterDateType__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_2(), "rule__ParameterBooleanType__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_2(), "rule__ParameterBase64Type__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getDefaultAssignment_2_2(), "rule__ParameterAnyType__DefaultAssignment_2_2");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3(), "rule__ParameterArrayType__TypeAssignment_3");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterArrayType__DefaultAssignment_4_1");
			builder.put(grammarAccess.getParameterListAccess().getValueAssignment_2(), "rule__ParameterList__ValueAssignment_2");
			builder.put(grammarAccess.getParameterListAccess().getValueAssignment_3_1(), "rule__ParameterList__ValueAssignment_3_1");
			builder.put(grammarAccess.getParameterAnyAccess().getValueAssignment_3_1(), "rule__ParameterAny__ValueAssignment_3_1");
			builder.put(grammarAccess.getParameterStringAccess().getValueAssignment(), "rule__ParameterString__ValueAssignment");
			builder.put(grammarAccess.getParameterBase64Access().getValueAssignment(), "rule__ParameterBase64__ValueAssignment");
			builder.put(grammarAccess.getParameterIntegerAccess().getValueAssignment(), "rule__ParameterInteger__ValueAssignment");
			builder.put(grammarAccess.getParameterDoubleAccess().getValueAssignment(), "rule__ParameterDouble__ValueAssignment");
			builder.put(grammarAccess.getParameterBooleanAccess().getValueAssignment(), "rule__ParameterBoolean__ValueAssignment");
			builder.put(grammarAccess.getParameterDateAccess().getValueAssignment(), "rule__ParameterDate__ValueAssignment");
			builder.put(grammarAccess.getParameterStructAccess().getValueAssignment_1_1(), "rule__ParameterStruct__ValueAssignment_1_1");
			builder.put(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2(), "rule__ParameterStruct__ValueAssignment_1_2_2");
			builder.put(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0(), "rule__ParameterStructMember__NameAssignment_0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3(), "rule__ParameterStructMember__ValueAssignment_3");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0(), "rule__ParameterStructTypeMember__NameAssignment_0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1(), "rule__ParameterStructTypeMember__TypeAssignment_1");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2(), "rule__GlobalNamespace__PartsAssignment_3_2");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1(), "rule__GlobalNamespace__PartsAssignment_3_3_1");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2(), "rule__RelativeNamespace_Impl__PartsAssignment_3_2");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1(), "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2(), "rule__PrivateNamespace__PartsAssignment_3_2");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1(), "rule__PrivateNamespace__PartsAssignment_3_3_1");
			builder.put(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), "rule__RosSystem__UnorderedGroup_5");
			builder.put(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), "rule__ComponentInterface__UnorderedGroup_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RosSystemGrammarAccess grammarAccess;

	@Override
	protected InternalRosSystemParser createParser() {
		InternalRosSystemParser result = new InternalRosSystemParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RosSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
