package com.example.moviedbsample.databinding;
import com.example.moviedbsample.R;
import com.example.moviedbsample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMovieListBindingImpl extends FragmentMovieListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMovieListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentMovieListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMoviesNames.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.moviedbsample.ui.MovieListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.moviedbsample.ui.MovieListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMovies((androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMovies(androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>> ViewModelMovies, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.util.List<com.example.moviedbsample.model.Movie>> viewModelMovies = null;
        java.lang.String viewModelMovies0Title = null;
        java.util.List<com.example.moviedbsample.model.Movie> viewModelMoviesGetValue = null;
        com.example.moviedbsample.ui.MovieListViewModel viewModel = mViewModel;
        com.example.moviedbsample.model.Movie viewModelMovies0 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.movies
                    viewModelMovies = viewModel.getMovies();
                }
                updateLiveDataRegistration(0, viewModelMovies);


                if (viewModelMovies != null) {
                    // read viewModel.movies.getValue()
                    viewModelMoviesGetValue = viewModelMovies.getValue();
                }


                if (viewModelMoviesGetValue != null) {
                    // read viewModel.movies.getValue()[0]
                    viewModelMovies0 = getFromList(viewModelMoviesGetValue, 0);
                }


                if (viewModelMovies0 != null) {
                    // read viewModel.movies.getValue()[0].title
                    viewModelMovies0Title = viewModelMovies0.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMoviesNames, viewModelMovies0Title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.movies
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}