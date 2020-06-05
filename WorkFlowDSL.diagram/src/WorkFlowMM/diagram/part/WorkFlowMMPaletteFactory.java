
/*
 * 
 */
package WorkFlowMM.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class WorkFlowMMPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(WorkFlowMM.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createDataGroup3CreationTool());
		paletteContainer.add(createDate4CreationTool());
		paletteContainer.add(createDecision5CreationTool());
		paletteContainer.add(createFile6CreationTool());
		paletteContainer.add(createFinal7CreationTool());
		paletteContainer.add(createImage8CreationTool());
		paletteContainer.add(createInitial9CreationTool());
		paletteContainer.add(createJoin10CreationTool());
		paletteContainer.add(createLabel11CreationTool());
		paletteContainer.add(createNumber12CreationTool());
		paletteContainer.add(createOption13CreationTool());
		paletteContainer.add(createPhone14CreationTool());
		paletteContainer.add(createRange15CreationTool());
		paletteContainer.add(createReceiveMsg16CreationTool());
		paletteContainer.add(createSendMsg17CreationTool());
		paletteContainer.add(createServiceTask18CreationTool());
		paletteContainer.add(createText19CreationTool());
		paletteContainer.add(createUserTask20CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(WorkFlowMM.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAttachRec1CreationTool());
		paletteContainer.add(createAttachSend2CreationTool());
		paletteContainer.add(createGenerates3CreationTool());
		paletteContainer.add(createInput4CreationTool());
		paletteContainer.add(createNavigatesTo5CreationTool());
		paletteContainer.add(createNext6CreationTool());
		paletteContainer.add(createRequires7CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.Actor1CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Actor1CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.CheckBox2CreationTool_title,
				WorkFlowMM.diagram.part.Messages.CheckBox2CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014));
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataGroup3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.DataGroup3CreationTool_title,
				WorkFlowMM.diagram.part.Messages.DataGroup3CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010));
		entry.setId("createDataGroup3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDate4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.Date4CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Date4CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Date_3017));
		entry.setId("createDate4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Date_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecision5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Decision5CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Decision5CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026));
		entry.setId("createDecision5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.File6CreationTool_title,
				WorkFlowMM.diagram.part.Messages.File6CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.File_3011));
		entry.setId("createFile6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.File_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinal7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.Final7CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Final7CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020));
		entry.setId("createFinal7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImage8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.Image8CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Image8CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Image_3015));
		entry.setId("createImage8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Image_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitial9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Initial9CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Initial9CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019));
		entry.setId("createInitial9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoin10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.Join10CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Join10CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027));
		entry.setId("createJoin10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Label11CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Label11CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024));
		entry.setId("createLabel11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNumber12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Number12CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Number12CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Number_3012));
		entry.setId("createNumber12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Number_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOption13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Option13CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Option13CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Option_3029));
		entry.setId("createOption13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Option_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPhone14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Phone14CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Phone14CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Phone_3018));
		entry.setId("createPhone14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Phone_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRange15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.Range15CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Range15CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Range_3016));
		entry.setId("createRange15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Range_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReceiveMsg16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.ReceiveMsg16CreationTool_title,
				WorkFlowMM.diagram.part.Messages.ReceiveMsg16CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022));
		entry.setId("createReceiveMsg16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSendMsg17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.SendMsg17CreationTool_title,
				WorkFlowMM.diagram.part.Messages.SendMsg17CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021));
		entry.setId("createSendMsg17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServiceTask18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.ServiceTask18CreationTool_title,
				WorkFlowMM.diagram.part.Messages.ServiceTask18CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023));
		entry.setId("createServiceTask18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createText19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(WorkFlowMM.diagram.part.Messages.Text19CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Text19CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Text_3028));
		entry.setId("createText19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Text_3028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserTask20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				WorkFlowMM.diagram.part.Messages.UserTask20CreationTool_title,
				WorkFlowMM.diagram.part.Messages.UserTask20CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025));
		entry.setId("createUserTask20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttachRec1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WorkFlowMM.diagram.part.Messages.AttachRec1CreationTool_title,
				WorkFlowMM.diagram.part.Messages.AttachRec1CreationTool_desc, Collections
						.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007));
		entry.setId("createAttachRec1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttachSend2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WorkFlowMM.diagram.part.Messages.AttachSend2CreationTool_title,
				WorkFlowMM.diagram.part.Messages.AttachSend2CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006));
		entry.setId("createAttachSend2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGenerates3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WorkFlowMM.diagram.part.Messages.Generates3CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Generates3CreationTool_desc, Collections
						.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003));
		entry.setId("createGenerates3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(WorkFlowMM.diagram.part.Messages.Input4CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Input4CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005));
		entry.setId("createInput4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNavigatesTo5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WorkFlowMM.diagram.part.Messages.NavigatesTo5CreationTool_title,
				WorkFlowMM.diagram.part.Messages.NavigatesTo5CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008));
		entry.setId("createNavigatesTo5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNext6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(WorkFlowMM.diagram.part.Messages.Next6CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Next6CreationTool_desc,
				Collections.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001));
		entry.setId("createNext6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRequires7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				WorkFlowMM.diagram.part.Messages.Requires7CreationTool_title,
				WorkFlowMM.diagram.part.Messages.Requires7CreationTool_desc, Collections
						.singletonList(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004));
		entry.setId("createRequires7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes
				.getImageDescriptor(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
