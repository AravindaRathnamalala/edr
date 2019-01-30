package lk.aravinda.cccrm_mvp.remote;

import java.util.List;

import lk.aravinda.cccrm_mvp.model.Post;

public interface PostSyncIn {

  interface OnPostListener {
    void onPostReceivedFailed(String msg);

    void onPostReceivedSuccess(List<Post> posts);
  }
}
