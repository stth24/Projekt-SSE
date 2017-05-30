package controllers;


import com.google.inject.Inject;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
public class CustomerController extends Controller {

    @Inject
    public FormFactory formFactory;


    public Result list() {
        List<Customer> customerList = Customer.find.all();

        return ok(views.html.customerList.render(customerList));
    }

    public Result show(Long id) {

        Customer customer = Customer.find.byId(id);

        return ok(views.html.customer.render(customer));
    }

    public Result create() {
        Form<Customer> customerForm = formFactory.form(Customer.class);
        Customer customer = customerForm.bindFromRequest().get();
        customer.save();
        return  redirect(routes.CustomerController.list());
    }

    public Result delete(Long id) {

        Customer customer = Customer.find.byId(id);
        List<ProjectHolder> holder = customer.getProjectHolders();


        for(ProjectHolder oneholder : holder) {
            oneholder.delete();
        }



        holder.clear();
        customer.save();
        customer.delete();

        return redirect(routes.CustomerController.list());

    }


}
