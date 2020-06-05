/*
* 
*/
package WorkFlowMM.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class WorkFlowMMNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem
				&& !isOwnView(((WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup group = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup) element;
			return WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem navigatorItem = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.unex.dmss.es/WorkFlowMM?WorkFlow", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.WorkFlow_1000);
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.unex.dmss.es/WorkFlowMM?Actor", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001);
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?DataGroup", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010);
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?File", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.File_3011);
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Number", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Number_3012);
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?CheckBox", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014);
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Image", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Image_3015);
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Range", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Range_3016);
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Date", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Date_3017);
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Phone", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Phone_3018);
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Initial", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019);
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Final", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020);
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?SendMsg", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?ReceiveMsg", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?ServiceTask", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023);
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Label", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024);
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?UserTask", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025);
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Decision", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026);
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Join", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027);
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Text", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Text_3028);
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.unex.dmss.es/WorkFlowMM?Option", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Option_3029);
		case WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?Operation?next", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?ServiceTask?generates", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?ServiceTask?requires", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004);
		case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?UserTask?input", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005);
		case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?SendMsg?attachSend", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?ReceiveMsg?attachRec", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007);
		case WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.unex.dmss.es/WorkFlowMM?SendMsg?navigatesTo", //$NON-NLS-1$
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.isKnownElementType(elementType)) {
			image = WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup group = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem navigatorItem = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			return getWorkFlow_1000Text(view);
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001Text(view);
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			return getDataGroup_3010Text(view);
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			return getFile_3011Text(view);
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			return getNumber_3012Text(view);
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3014Text(view);
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3015Text(view);
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_3016Text(view);
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			return getDate_3017Text(view);
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			return getPhone_3018Text(view);
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			return getInitial_3019Text(view);
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getFinal_3020Text(view);
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			return getSendMsg_3021Text(view);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			return getReceiveMsg_3022Text(view);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			return getServiceTask_3023Text(view);
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3024Text(view);
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			return getUserTask_3025Text(view);
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_3026Text(view);
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_3027Text(view);
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3028Text(view);
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return getOption_3029Text(view);
		case WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID:
			return getOperationNext_4001Text(view);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID:
			return getServiceTaskGenerates_4003Text(view);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID:
			return getServiceTaskRequires_4004Text(view);
		case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID:
			return getUserTaskInput_4005Text(view);
		case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID:
			return getSendMsgAttachSend_4006Text(view);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID:
			return getReceiveMsgAttachRec_4007Text(view);
		case WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID:
			return getSendMsgNavigatesTo_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWorkFlow_1000Text(View view) {
		WorkFlowMM.WorkFlow domainModelElement = (WorkFlowMM.WorkFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_2001Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataGroup_3010Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.DataGroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFile_3011Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.File_3011,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.FileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNumber_3012Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Number_3012,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.NumberNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3014Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3015Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Image_3015,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.ImageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRange_3016Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Range_3016,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.RangeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDate_3017Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Date_3017,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.DateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPhone_3018Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Phone_3018,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.PhoneNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitial_3019Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.InitialIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFinal_3020Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.FinalIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSendMsg_3021Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.SendMsgNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReceiveMsg_3022Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServiceTask_3023Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3024Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.LabelIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserTask_3025Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.UserTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDecision_3026Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.DecisionIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJoin_3027Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.JoinIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getText_3028Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Text_3028,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.TextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOption_3029Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Option_3029,
				view.getElement() != null ? view.getElement() : view, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
						.getType(WorkFlowMM.diagram.edit.parts.OptionFieldnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOperationNext_4001Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServiceTaskGenerates_4003Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServiceTaskRequires_4004Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserTaskInput_4005Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSendMsgAttachSend_4006Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReceiveMsgAttachRec_4007Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSendMsgNavigatesTo_4008Text(View view) {
		IParser parser = WorkFlowMM.diagram.providers.WorkFlowMMParserProvider.getParser(
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID
				.equals(WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getModelID(view));
	}

}
