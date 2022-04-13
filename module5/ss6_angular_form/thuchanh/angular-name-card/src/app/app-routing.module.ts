import {RouterModule, Routes} from "@angular/router";
import {TodoComponent} from "./todo/todo.component";
import {CreateTodoComponent} from "./todo/create-todo/create-todo.component";
import {DeleteTodoComponent} from "./todo/delete-todo/delete-todo.component";
import {NgModule} from "@angular/core";

const routes: Routes = [
  {path: '', component: TodoComponent},
  {path: 'create', component: CreateTodoComponent},
  {path: 'delete/:id', component: DeleteTodoComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
