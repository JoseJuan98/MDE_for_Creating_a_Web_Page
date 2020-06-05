/**
 */
package WorkFlowMM;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.Operation#getID <em>ID</em>}</li>
 *   <li>{@link WorkFlowMM.Operation#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getOperation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InitialTaskMustNotBePreceded NextOperationMustNotBeItself NextOperationToAnotherActorMustNeedASendMsgTask'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InitialTaskMustNotBePreceded='\n\t\t\tself.next->forAll(op : Operation |\n\t\t\t\tnot op.oclIsTypeOf(Initial)\n\t\t\t)' NextOperationMustNotBeItself='\n\t\t\tself.next->forAll(op : Operation |\n\t\t\t\top <> self\n\t\t\t)' NextOperationToAnotherActorMustNeedASendMsgTask='\n\t\t\tself.next->forAll(op : Operation |\n\t\t\t\t(not self.oclIsTypeOf(SendMsg)) implies op.oclContainer = self.oclContainer\n\t\t\t)'"
 *        annotation="gmf.node label='ID' border.color='0,0,0' color='250,250,200'"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see WorkFlowMM.WorkFlowMMPackage#getOperation_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link WorkFlowMM.Operation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link WorkFlowMM.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see WorkFlowMM.WorkFlowMMPackage#getOperation_Next()
	 * @model upper="2"
	 *        annotation="gmf.link label.icon='false' width='2' color='0,0,0' target.decoration='arrow'"
	 * @generated
	 */
	EList<Operation> getNext();

} // Operation
