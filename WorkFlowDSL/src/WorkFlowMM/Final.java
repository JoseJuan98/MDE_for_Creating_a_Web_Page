/**
 */
package WorkFlowMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getFinal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FinalTaskMustNotHasAnySuccessor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FinalTaskMustNotHasAnySuccessor='\n\t\t\tself.next->size() = 0'"
 * @generated
 */
public interface Final extends Label {
} // Final
