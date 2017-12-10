public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
	
	 @Override
    protected void onCreate(Bundle savedInstanceState) {
		
		
	//	along with other content need to those code for search and item right item click on ListView
	//                   the searching view
        customerList.setTextFilterEnabled(true);
        setupSearchView();
//                   end of searchikng view

                        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						CustomerDataListModel link = (MyModel) parent.getItemAtPosition(position);
						String customerName = link.getName();
                        String customerID = link.getId();
						
						  Intent intent1 = new Intent(SearchActivity.this, detailsActivity.class);
                                Bundle extras = new Bundle();
                                extras.putString("Customer_name",customerName);
                                extras.putString("customer_id",customerID);
                                intent1.putExtras(extras);
                                startActivity(intent1);
						}


	}
	
}