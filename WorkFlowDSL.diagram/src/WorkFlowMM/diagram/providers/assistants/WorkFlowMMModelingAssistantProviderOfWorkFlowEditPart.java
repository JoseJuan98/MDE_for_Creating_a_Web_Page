/*
 * 
 */
package WorkFlowMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WorkFlowMMModelingAssistantProviderOfWorkFlowEditPart
		extends WorkFlowMM.diagram.providers.WorkFlowMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001);
		return types;
	}

}
