/**
 */
package WorkFlowMM;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.Task#getName <em>Name</em>}</li>
 *   <li>{@link WorkFlowMM.Task#getDescript <em>Descript</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getTask()
 * @model abstract="true"
 *        annotation="gmf.node label='ID'"
 * @generated
 */
public interface Task extends Operation {
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
	 * @see WorkFlowMM.WorkFlowMMPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WorkFlowMM.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descript</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descript</em>' attribute.
	 * @see #setDescript(String)
	 * @see WorkFlowMM.WorkFlowMMPackage#getTask_Descript()
	 * @model
	 * @generated
	 */
	String getDescript();

	/**
	 * Sets the value of the '{@link WorkFlowMM.Task#getDescript <em>Descript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descript</em>' attribute.
	 * @see #getDescript()
	 * @generated
	 */
	void setDescript(String value);

} // Task
