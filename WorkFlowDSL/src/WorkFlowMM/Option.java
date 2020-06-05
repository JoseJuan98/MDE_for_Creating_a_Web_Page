/**
 */
package WorkFlowMM;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.Option#getFieldname <em>Fieldname</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getOption()
 * @model annotation="gmf.node label='fieldname' border.color='0,0,0' color='100,100,100'"
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Fieldname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fieldname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldname</em>' attribute.
	 * @see #setFieldname(String)
	 * @see WorkFlowMM.WorkFlowMMPackage#getOption_Fieldname()
	 * @model
	 * @generated
	 */
	String getFieldname();

	/**
	 * Sets the value of the '{@link WorkFlowMM.Option#getFieldname <em>Fieldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldname</em>' attribute.
	 * @see #getFieldname()
	 * @generated
	 */
	void setFieldname(String value);

} // Option
