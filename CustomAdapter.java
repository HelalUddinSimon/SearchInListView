
public class CustomerDataAdapter extends ArrayAdapter<MyModel> implements Filterable {
//          filter
   public Filter getFilter() {
       return new Filter() {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            final FilterResults oReturn = new FilterResults();
            final ArrayList<MyModel> results = new ArrayList<MyModel>();
            if (ListArrayForSearch == null)
                ListArrayForSearch = allPersons;
            if (constraint != null) {
                if (ListArrayForSearch != null && ListArrayForSearch.size() > 0) {
                    for (final MyModel g : ListArrayForSearch) {
                        if (g.getName().toLowerCase()
                                .contains(constraint.toString()))
                            results.add(g);
                    }
                }
                oReturn.values = results;
            }
            return oReturn;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint,
                                      FilterResults results) {
            allPersons = (ArrayList<MyModel>) results.values;
            notifyDataSetChanged();
        }
    };
	
   }