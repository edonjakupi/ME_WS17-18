/*
 * generated by Xtext 2.12.0
 */
package at.ac.tuwien.big.ide.contentassist.antlr;

import at.ac.tuwien.big.ide.contentassist.antlr.internal.InternalStlParser;
import at.ac.tuwien.big.services.StlGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class StlParser extends AbstractContentAssistParser {

	@Inject
	private StlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalStlParser createParser() {
		InternalStlParser result = new InternalStlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getServiceAccess().getAlternatives(), "rule__Service__Alternatives");
					put(grammarAccess.getStoreAccess().getAlternatives(), "rule__Store__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getAreaAccess().getGroup(), "rule__Area__Group__0");
					put(grammarAccess.getItemTypeAccess().getGroup(), "rule__ItemType__Group__0");
					put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_0(), "rule__Service__Group_0__0");
					put(grammarAccess.getServiceAccess().getGroup_1(), "rule__Service__Group_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getSlotAccess().getGroup(), "rule__Slot__Group__0");
					put(grammarAccess.getItemGeneratorAccess().getGroup(), "rule__ItemGenerator__Group__0");
					put(grammarAccess.getProductStoreAccess().getGroup(), "rule__ProductStore__Group__0");
					put(grammarAccess.getWasteStoreAccess().getGroup(), "rule__WasteStore__Group__0");
					put(grammarAccess.getBufferAccess().getGroup(), "rule__Buffer__Group__0");
					put(grammarAccess.getConveyorAccess().getGroup(), "rule__Conveyor__Group__0");
					put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
					put(grammarAccess.getMachineAccess().getGroup_5(), "rule__Machine__Group_5__0");
					put(grammarAccess.getMachineAccess().getGroup_6(), "rule__Machine__Group_6__0");
					put(grammarAccess.getTurnTableAccess().getGroup(), "rule__TurnTable__Group__0");
					put(grammarAccess.getTurnTableAccess().getGroup_5(), "rule__TurnTable__Group_5__0");
					put(grammarAccess.getTurnTableAccess().getGroup_6(), "rule__TurnTable__Group_6__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getItemTypesAssignment_3(), "rule__System__ItemTypesAssignment_3");
					put(grammarAccess.getSystemAccess().getAreasAssignment_4(), "rule__System__AreasAssignment_4");
					put(grammarAccess.getAreaAccess().getNameAssignment_1(), "rule__Area__NameAssignment_1");
					put(grammarAccess.getAreaAccess().getComponentsAssignment_3(), "rule__Area__ComponentsAssignment_3");
					put(grammarAccess.getAreaAccess().getConnectorsAssignment_4(), "rule__Area__ConnectorsAssignment_4");
					put(grammarAccess.getItemTypeAccess().getNameAssignment_1(), "rule__ItemType__NameAssignment_1");
					put(grammarAccess.getItemTypeAccess().getDescriptionAssignment_3(), "rule__ItemType__DescriptionAssignment_3");
					put(grammarAccess.getConnectorAccess().getEntryAssignment_0(), "rule__Connector__EntryAssignment_0");
					put(grammarAccess.getConnectorAccess().getExitAssignment_2(), "rule__Connector__ExitAssignment_2");
					put(grammarAccess.getServiceAccess().getNameAssignment_0_1(), "rule__Service__NameAssignment_0_1");
					put(grammarAccess.getServiceAccess().getCostAssignment_0_3(), "rule__Service__CostAssignment_0_3");
					put(grammarAccess.getServiceAccess().getReliabilityAssignment_0_5(), "rule__Service__ReliabilityAssignment_0_5");
					put(grammarAccess.getServiceAccess().getProcessingTimeAssignment_0_7(), "rule__Service__ProcessingTimeAssignment_0_7");
					put(grammarAccess.getServiceAccess().getNameAssignment_1_1(), "rule__Service__NameAssignment_1_1");
					put(grammarAccess.getServiceAccess().getCostAssignment_1_3(), "rule__Service__CostAssignment_1_3");
					put(grammarAccess.getServiceAccess().getReliabilityAssignment_1_5(), "rule__Service__ReliabilityAssignment_1_5");
					put(grammarAccess.getServiceAccess().getProcessingTimeAssignment_1_7(), "rule__Service__ProcessingTimeAssignment_1_7");
					put(grammarAccess.getServiceAccess().getParametersAssignment_1_9(), "rule__Service__ParametersAssignment_1_9");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getSlotAccess().getNameAssignment_0(), "rule__Slot__NameAssignment_0");
					put(grammarAccess.getSlotAccess().getRequiredTypeAssignment_2(), "rule__Slot__RequiredTypeAssignment_2");
					put(grammarAccess.getItemGeneratorAccess().getNameAssignment_1(), "rule__ItemGenerator__NameAssignment_1");
					put(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_3(), "rule__ItemGenerator__GeneratedTypeAssignment_3");
					put(grammarAccess.getItemGeneratorAccess().getCostAssignment_5(), "rule__ItemGenerator__CostAssignment_5");
					put(grammarAccess.getItemGeneratorAccess().getOutputSlotsAssignment_8(), "rule__ItemGenerator__OutputSlotsAssignment_8");
					put(grammarAccess.getItemGeneratorAccess().getServicesAssignment_9(), "rule__ItemGenerator__ServicesAssignment_9");
					put(grammarAccess.getProductStoreAccess().getNameAssignment_1(), "rule__ProductStore__NameAssignment_1");
					put(grammarAccess.getProductStoreAccess().getCostAssignment_3(), "rule__ProductStore__CostAssignment_3");
					put(grammarAccess.getProductStoreAccess().getCapacityAssignment_5(), "rule__ProductStore__CapacityAssignment_5");
					put(grammarAccess.getProductStoreAccess().getInputSlotsAssignment_8(), "rule__ProductStore__InputSlotsAssignment_8");
					put(grammarAccess.getProductStoreAccess().getServicesAssignment_9(), "rule__ProductStore__ServicesAssignment_9");
					put(grammarAccess.getWasteStoreAccess().getNameAssignment_1(), "rule__WasteStore__NameAssignment_1");
					put(grammarAccess.getWasteStoreAccess().getCostAssignment_3(), "rule__WasteStore__CostAssignment_3");
					put(grammarAccess.getWasteStoreAccess().getCapacityAssignment_5(), "rule__WasteStore__CapacityAssignment_5");
					put(grammarAccess.getWasteStoreAccess().getInputSlotsAssignment_8(), "rule__WasteStore__InputSlotsAssignment_8");
					put(grammarAccess.getWasteStoreAccess().getServicesAssignment_9(), "rule__WasteStore__ServicesAssignment_9");
					put(grammarAccess.getBufferAccess().getNameAssignment_1(), "rule__Buffer__NameAssignment_1");
					put(grammarAccess.getBufferAccess().getCostAssignment_3(), "rule__Buffer__CostAssignment_3");
					put(grammarAccess.getBufferAccess().getInputSlotsAssignment_6(), "rule__Buffer__InputSlotsAssignment_6");
					put(grammarAccess.getBufferAccess().getOutputSlotsAssignment_8(), "rule__Buffer__OutputSlotsAssignment_8");
					put(grammarAccess.getBufferAccess().getServicesAssignment_9(), "rule__Buffer__ServicesAssignment_9");
					put(grammarAccess.getConveyorAccess().getNameAssignment_1(), "rule__Conveyor__NameAssignment_1");
					put(grammarAccess.getConveyorAccess().getCostAssignment_3(), "rule__Conveyor__CostAssignment_3");
					put(grammarAccess.getConveyorAccess().getInputSlotsAssignment_6(), "rule__Conveyor__InputSlotsAssignment_6");
					put(grammarAccess.getConveyorAccess().getOutputSlotsAssignment_8(), "rule__Conveyor__OutputSlotsAssignment_8");
					put(grammarAccess.getConveyorAccess().getServicesAssignment_9(), "rule__Conveyor__ServicesAssignment_9");
					put(grammarAccess.getMachineAccess().getNameAssignment_1(), "rule__Machine__NameAssignment_1");
					put(grammarAccess.getMachineAccess().getCostAssignment_3(), "rule__Machine__CostAssignment_3");
					put(grammarAccess.getMachineAccess().getInputSlotsAssignment_5_1(), "rule__Machine__InputSlotsAssignment_5_1");
					put(grammarAccess.getMachineAccess().getOutputSlotsAssignment_6_1(), "rule__Machine__OutputSlotsAssignment_6_1");
					put(grammarAccess.getMachineAccess().getServicesAssignment_7(), "rule__Machine__ServicesAssignment_7");
					put(grammarAccess.getTurnTableAccess().getNameAssignment_1(), "rule__TurnTable__NameAssignment_1");
					put(grammarAccess.getTurnTableAccess().getCostAssignment_3(), "rule__TurnTable__CostAssignment_3");
					put(grammarAccess.getTurnTableAccess().getInputSlotsAssignment_5_1(), "rule__TurnTable__InputSlotsAssignment_5_1");
					put(grammarAccess.getTurnTableAccess().getOutputSlotsAssignment_6_1(), "rule__TurnTable__OutputSlotsAssignment_6_1");
					put(grammarAccess.getTurnTableAccess().getServicesAssignment_7(), "rule__TurnTable__ServicesAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public StlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}