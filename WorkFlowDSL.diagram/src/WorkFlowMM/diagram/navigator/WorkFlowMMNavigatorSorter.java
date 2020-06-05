/*
* 
*/
package WorkFlowMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class WorkFlowMMNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7006;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7005;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem item = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
