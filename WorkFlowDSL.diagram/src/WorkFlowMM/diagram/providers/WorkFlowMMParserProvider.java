/*
 * 
 */
package WorkFlowMM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WorkFlowMMParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser actorName_5010Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5010Parser() {
		if (actorName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getActor_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			actorName_5010Parser = parser;
		}
		return actorName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser initialID_5020Parser;

	/**
	* @generated
	*/
	private IParser getInitialID_5020Parser() {
		if (initialID_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			initialID_5020Parser = parser;
		}
		return initialID_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser finalID_5021Parser;

	/**
	* @generated
	*/
	private IParser getFinalID_5021Parser() {
		if (finalID_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			finalID_5021Parser = parser;
		}
		return finalID_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser sendMsgName_5022Parser;

	/**
	* @generated
	*/
	private IParser getSendMsgName_5022Parser() {
		if (sendMsgName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getTask_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			sendMsgName_5022Parser = parser;
		}
		return sendMsgName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser receiveMsgName_5023Parser;

	/**
	* @generated
	*/
	private IParser getReceiveMsgName_5023Parser() {
		if (receiveMsgName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getTask_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			receiveMsgName_5023Parser = parser;
		}
		return receiveMsgName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser serviceTaskID_5024Parser;

	/**
	* @generated
	*/
	private IParser getServiceTaskID_5024Parser() {
		if (serviceTaskID_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			serviceTaskID_5024Parser = parser;
		}
		return serviceTaskID_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser labelID_5025Parser;

	/**
	* @generated
	*/
	private IParser getLabelID_5025Parser() {
		if (labelID_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			labelID_5025Parser = parser;
		}
		return labelID_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser userTaskID_5026Parser;

	/**
	* @generated
	*/
	private IParser getUserTaskID_5026Parser() {
		if (userTaskID_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			userTaskID_5026Parser = parser;
		}
		return userTaskID_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser decisionID_5027Parser;

	/**
	* @generated
	*/
	private IParser getDecisionID_5027Parser() {
		if (decisionID_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			decisionID_5027Parser = parser;
		}
		return decisionID_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser joinID_5028Parser;

	/**
	* @generated
	*/
	private IParser getJoinID_5028Parser() {
		if (joinID_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_ID() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			joinID_5028Parser = parser;
		}
		return joinID_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser dataGroupName_5019Parser;

	/**
	* @generated
	*/
	private IParser getDataGroupName_5019Parser() {
		if (dataGroupName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDataGroup_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			dataGroupName_5019Parser = parser;
		}
		return dataGroupName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser fileName_5011Parser;

	/**
	* @generated
	*/
	private IParser getFileName_5011Parser() {
		if (fileName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			fileName_5011Parser = parser;
		}
		return fileName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser numberName_5012Parser;

	/**
	* @generated
	*/
	private IParser getNumberName_5012Parser() {
		if (numberName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			numberName_5012Parser = parser;
		}
		return numberName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser textName_5029Parser;

	/**
	* @generated
	*/
	private IParser getTextName_5029Parser() {
		if (textName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			textName_5029Parser = parser;
		}
		return textName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5014Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5014Parser() {
		if (checkBoxName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			checkBoxName_5014Parser = parser;
		}
		return checkBoxName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser optionFieldname_5030Parser;

	/**
	* @generated
	*/
	private IParser getOptionFieldname_5030Parser() {
		if (optionFieldname_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOption_Fieldname() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			optionFieldname_5030Parser = parser;
		}
		return optionFieldname_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser imageName_5015Parser;

	/**
	* @generated
	*/
	private IParser getImageName_5015Parser() {
		if (imageName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			imageName_5015Parser = parser;
		}
		return imageName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser rangeName_5016Parser;

	/**
	* @generated
	*/
	private IParser getRangeName_5016Parser() {
		if (rangeName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			rangeName_5016Parser = parser;
		}
		return rangeName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser dateName_5017Parser;

	/**
	* @generated
	*/
	private IParser getDateName_5017Parser() {
		if (dateName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			dateName_5017Parser = parser;
		}
		return dateName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser phoneName_5018Parser;

	/**
	* @generated
	*/
	private IParser getPhoneName_5018Parser() {
		if (phoneName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getData_Name() };
			WorkFlowMM.diagram.parsers.MessageFormatParser parser = new WorkFlowMM.diagram.parsers.MessageFormatParser(
					features);
			phoneName_5018Parser = parser;
		}
		return phoneName_5018Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WorkFlowMM.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
			return getActorName_5010Parser();
		case WorkFlowMM.diagram.edit.parts.InitialIDEditPart.VISUAL_ID:
			return getInitialID_5020Parser();
		case WorkFlowMM.diagram.edit.parts.FinalIDEditPart.VISUAL_ID:
			return getFinalID_5021Parser();
		case WorkFlowMM.diagram.edit.parts.SendMsgNameEditPart.VISUAL_ID:
			return getSendMsgName_5022Parser();
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgNameEditPart.VISUAL_ID:
			return getReceiveMsgName_5023Parser();
		case WorkFlowMM.diagram.edit.parts.ServiceTaskIDEditPart.VISUAL_ID:
			return getServiceTaskID_5024Parser();
		case WorkFlowMM.diagram.edit.parts.LabelIDEditPart.VISUAL_ID:
			return getLabelID_5025Parser();
		case WorkFlowMM.diagram.edit.parts.UserTaskIDEditPart.VISUAL_ID:
			return getUserTaskID_5026Parser();
		case WorkFlowMM.diagram.edit.parts.DecisionIDEditPart.VISUAL_ID:
			return getDecisionID_5027Parser();
		case WorkFlowMM.diagram.edit.parts.JoinIDEditPart.VISUAL_ID:
			return getJoinID_5028Parser();
		case WorkFlowMM.diagram.edit.parts.DataGroupNameEditPart.VISUAL_ID:
			return getDataGroupName_5019Parser();
		case WorkFlowMM.diagram.edit.parts.FileNameEditPart.VISUAL_ID:
			return getFileName_5011Parser();
		case WorkFlowMM.diagram.edit.parts.NumberNameEditPart.VISUAL_ID:
			return getNumberName_5012Parser();
		case WorkFlowMM.diagram.edit.parts.TextNameEditPart.VISUAL_ID:
			return getTextName_5029Parser();
		case WorkFlowMM.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID:
			return getCheckBoxName_5014Parser();
		case WorkFlowMM.diagram.edit.parts.OptionFieldnameEditPart.VISUAL_ID:
			return getOptionFieldname_5030Parser();
		case WorkFlowMM.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
			return getImageName_5015Parser();
		case WorkFlowMM.diagram.edit.parts.RangeNameEditPart.VISUAL_ID:
			return getRangeName_5016Parser();
		case WorkFlowMM.diagram.edit.parts.DateNameEditPart.VISUAL_ID:
			return getDateName_5017Parser();
		case WorkFlowMM.diagram.edit.parts.PhoneNameEditPart.VISUAL_ID:
			return getPhoneName_5018Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
