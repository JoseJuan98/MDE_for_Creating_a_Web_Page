/**
 */
package WorkFlowMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.UserTask#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getUserTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TaskMustHasOneSuccessor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TaskMustHasOneSuccessor='\n\t\t\tself.next->size() = 1'"
 * @generated
 */
public interface UserTask extends Task {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(DataGroup)
	 * @see WorkFlowMM.WorkFlowMMPackage#getUserTask_Input()
	 * @model required="true"
	 *        annotation="gmf.link border.color='0,100,0' style='dot' width='2'"
	 * @generated
	 */
	DataGroup getInput();

	/**
	 * Sets the value of the '{@link WorkFlowMM.UserTask#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DataGroup value);

} // UserTask
