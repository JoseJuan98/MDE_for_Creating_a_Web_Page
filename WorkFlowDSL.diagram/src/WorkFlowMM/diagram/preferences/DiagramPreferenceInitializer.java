/*
 * 
 */
package WorkFlowMM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		WorkFlowMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		WorkFlowMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		WorkFlowMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		WorkFlowMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		WorkFlowMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
