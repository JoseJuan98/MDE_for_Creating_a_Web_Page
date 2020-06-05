/**
 */
package WorkFlowMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.CheckBox#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends Data {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link WorkFlowMM.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see WorkFlowMM.WorkFlowMMPackage#getCheckBox_Options()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true' layout='list'"
	 * @generated
	 */
	EList<Option> getOptions();

} // CheckBox
