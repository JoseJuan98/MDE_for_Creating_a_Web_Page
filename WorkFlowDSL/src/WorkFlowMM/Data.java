/**
 */
package WorkFlowMM;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.Data#getName <em>Name</em>}</li>
 *   <li>{@link WorkFlowMM.Data#isRequiered <em>Requiered</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getData()
 * @model abstract="true"
 *        annotation="gmf.node label='name' border.color='0,0,0' color='150,100,100'"
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WorkFlowMM.WorkFlowMMPackage#getData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WorkFlowMM.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requiered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiered</em>' attribute.
	 * @see #setRequiered(boolean)
	 * @see WorkFlowMM.WorkFlowMMPackage#getData_Requiered()
	 * @model
	 * @generated
	 */
	boolean isRequiered();

	/**
	 * Sets the value of the '{@link WorkFlowMM.Data#isRequiered <em>Requiered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiered</em>' attribute.
	 * @see #isRequiered()
	 * @generated
	 */
	void setRequiered(boolean value);

} // Data
