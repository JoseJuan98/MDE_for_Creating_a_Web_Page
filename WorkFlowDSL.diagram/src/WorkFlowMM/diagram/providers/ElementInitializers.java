/*
 * 
 */
package WorkFlowMM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
