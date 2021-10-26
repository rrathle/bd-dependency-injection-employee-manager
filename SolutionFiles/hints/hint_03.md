If the error is related to not being able to find a Dagger class, make sure you have built your ClassroomSnippets
package with rde wflow run or brazil-build. You may also have to run the Brazil->Sync from Workspace step so IntelliJ
can find the Dagger classes. The classes should show up in an `/annotation-generated-src` directory in your project
workspace and IntelliJ, and the folder icon in your IntelliJ project should be blue
